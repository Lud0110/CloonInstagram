package com.example.instagramproject.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramproject.profile.components.ProfileHeader

@Composable
fun ProfileScreen() {
    ProfileHeader(
        backClick = { /*TODO*/ },
        notificationClick = { /*TODO*/ },
        optionClick = { /*TODO*/ })
    
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}