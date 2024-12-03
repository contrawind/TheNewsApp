package com.example.thenewsapp.models

/**
 * 新闻响应数据类
 */
data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)