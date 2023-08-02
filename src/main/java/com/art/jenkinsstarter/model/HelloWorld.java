package com.art.jenkinsstarter.model;

import java.time.LocalDate;

public record HelloWorld(String message,
                         LocalDate createdAt) {
}
