package com.example.instagramproject.profile.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProfilePost(
    images: List<String>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(modifier = modifier, cells = GridCells.Fixed(3)) {
        items(images) {
            PostItem(imageUrl = it)
        }
    }
}

@Composable
private fun PostItem(
    imageUrl: String,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier) {
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }
}

@Composable
@Preview(showBackground = true)
fun ProfilePostPreview() {
    ProfilePost(emptyList())
}