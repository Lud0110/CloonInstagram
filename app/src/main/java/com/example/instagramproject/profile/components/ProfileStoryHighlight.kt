package com.example.instagramproject.profile.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramproject.profile.Story

@Composable
fun ProfileStoryHighlight(
    stories: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {
        items(stories) {
            StoryItem()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileStoryHighlightPreview() {
    ProfileStoryHighlight()
}