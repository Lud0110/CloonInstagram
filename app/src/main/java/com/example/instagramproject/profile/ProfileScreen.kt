package com.example.instagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.profile.components.ProfileAction
import com.example.instagramproject.profile.components.ProfileDescription
import com.example.instagramproject.profile.components.ProfileHeader
import com.example.instagramproject.profile.components.ProfileInformation
import com.example.instagramproject.profile.components.ProfilePostImage
import com.example.instagramproject.profile.components.ProfileStoryHighlight

@Composable
fun ProfileScreen() {
    val user = User(
        username = "Ludwin Rodriguez",
        profileImageUrl = "https://via.placeholder.com/200",
        followers = 30,
        following = 15,
        name = "Ludwin Rodriguez",
        description = "Intentando programar desde 2020",
        stories = listOf(
            Story(image = "https://via.placeholder.com/200", text = "Story 1"),
            Story(image = "https://via.placeholder.com/200", text = "Story 2"),
            Story(image = "https://via.placeholder.com/200", text = "Story 3"),
            Story(image = "https://via.placeholder.com/200", text = "Story 4"),
            Story(image = "https://via.placeholder.com/200", text = "Story 5"),
            Story(image = "https://via.placeholder.com/200", text = "Story 6"),
            Story(image = "https://via.placeholder.com/200", text = "Story 7"),
            Story(image = "https://via.placeholder.com/200", text = "Story 8"),
        ),
        posts = listOf(
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            )
    )

    val size = 3
    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionClick = { /*TODO*/ },
            username = user.username
        )
        LazyVerticalGrid(columns = GridCells.Fixed(size)) {
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileInformation(
                    imageUrl = user.profileImageUrl,
                    posts = user.posts.size,
                    followers = user.followers,
                    following = user.following
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileDescription(
                    name = user.name,
                    description = user.description,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileAction(
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                )
            }
            item(span = {
                GridItemSpan(size)
            }) {
                ProfileStoryHighlight(
                    stories = user.stories,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
                )
            }
            items(user.posts) {
                ProfilePostImage(image = it, modifier = Modifier.padding(1.dp))
            }
        }

        /*
        LazyColumn {
            item { ProfileHeader(
                backClick = { /*TODO*/ },
                notificationClick = { /*TODO*/ },
                optionClick = { /*TODO*/ },
                username = user.username
            ) }
            item {ProfileInformation(
                imageUrl = user.profileImageUrl,
                posts = user.posts.size,
                followers = user.followers,
                following = user.following
            ) }
            item {ProfileDescription(
                name = user.name,
                description = user.description,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
            ) }
            item {ProfileAction(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) }
            item {ProfileStoryHighlight(
                stories = user.stories,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)
            ) }
            item {
                ProfilePost(images = user.posts, modifier = Modifier.padding(top = 16.dp))
            }
        }*/
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}