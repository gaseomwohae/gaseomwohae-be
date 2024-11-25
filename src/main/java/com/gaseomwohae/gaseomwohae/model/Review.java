package com.gaseomwohae.gaseomwohae.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Review {
	private Long id;
	private Long userId;
	private Long placeId;
	private Byte rating;
	private String content;
	private String image;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;
} 