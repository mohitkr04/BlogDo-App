package com.example.blogdoapp

data class BlogData(
    val userName:String,
    val date:String,
    val time:String,
    val title:String,
    val blog:String,
    var isLiked:Boolean,
    var isSaved:Boolean
)
