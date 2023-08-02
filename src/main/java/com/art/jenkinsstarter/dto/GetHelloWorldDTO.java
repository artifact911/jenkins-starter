package com.art.jenkinsstarter.dto;

import java.time.LocalDate;

public record GetHelloWorldDTO(String message,
                               LocalDate createdAt) {
}
