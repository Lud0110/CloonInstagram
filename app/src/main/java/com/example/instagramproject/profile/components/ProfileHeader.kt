package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeader(
    backClick: () -> Unit,
    notificationClick: () -> Unit,
    optionClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = backClick) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrow back")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Ludwin Rodriguez", fontWeight = FontWeight.Bold)
            }
        }
        ProfileHeaderOptions(notificationClick = notificationClick, optionClick = optionClick)
    }
    
}

@Composable
private fun ProfileHeaderOptions(
    notificationClick: () -> Unit,
    optionClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        IconButton(onClick = notificationClick) {
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "notifications")
        }
        IconButton(onClick = optionClick) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "options")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview() {
    ProfileHeader({}, {}, {})
}