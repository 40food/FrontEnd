package com.umc.ttoklip.data.model.honeytip


data class InquireHoneyTipResponse(
    val honeyTipId: Int,
    val title: String,
    val content: String,
    val writer: String?,
    val writtenTime: String,
    val category: String,
    val imageUrls: List<ImageUrl>?,
    val commentResponse: List<CommentResponse>?,
    val likedByCurrentUser: Boolean,
    val scrapedByCurrentUser: Boolean,
    val urlResponses: List<Urls>?,

)
