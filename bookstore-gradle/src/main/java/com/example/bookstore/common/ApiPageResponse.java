package com.example.bookstore.common;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.domain.Page;

/**
 * Standard paginated API response wrapper.
 *
 * <p>All paginated endpoints return {@code ApiPageResponse<T>}.
 * EasyBase is configured with {@code responseWrapper.pagedClass} pointing to this class.
 */
public class ApiPageResponse<T> {

    @JsonProperty("data")
    private final List<T> data;

    @JsonProperty("success")
    private final boolean success;

    @JsonProperty("timestamp")
    private final Instant timestamp;

    @JsonProperty("page")
    private final int page;

    @JsonProperty("size")
    private final int size;

    @JsonProperty("totalElements")
    private final long totalElements;

    @JsonProperty("totalPages")
    private final int totalPages;

    @JsonProperty("last")
    private final boolean last;

    private ApiPageResponse(Page<T> pageData) {
        this.data = pageData.getContent();
        this.success = true;
        this.timestamp = Instant.now();
        this.page = pageData.getNumber();
        this.size = pageData.getSize();
        this.totalElements = pageData.getTotalElements();
        this.totalPages = pageData.getTotalPages();
        this.last = pageData.isLast();
    }

    public static <T> ApiPageResponse<T> of(Page<T> page) {
        return new ApiPageResponse<>(page);
    }

    public List<T> getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean isLast() {
        return last;
    }
}
