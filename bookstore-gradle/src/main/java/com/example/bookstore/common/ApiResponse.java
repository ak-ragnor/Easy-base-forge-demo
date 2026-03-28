package com.example.bookstore.common;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Standard single-item API response wrapper.
 *
 * <p>All non-paginated endpoints return {@code ApiResponse<T>}.
 * EasyBase is configured with {@code responseWrapper.singleClass} pointing to this class.
 */
public class ApiResponse<T> {

    @JsonProperty("data")
    private final T data;

    @JsonProperty("success")
    private final boolean success;

    @JsonProperty("timestamp")
    private final Instant timestamp;

    @JsonProperty("message")
    private final String message;

    private ApiResponse(T data, boolean success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
        this.timestamp = Instant.now();
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(data, true, null);
    }

    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>(null, false, message);
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
