package com.fsck.k9.ui.messagelist

import com.fsck.k9.FontSizes

data class MessageListAppearance(
    val fontSizes: FontSizes,
    val previewLines: Int,
    val stars: Boolean,
    val senderAboveSubject: Boolean,
    val showContactPicture: Boolean,
    val showingThreadedList: Boolean,
    val backGroundAsReadIndicator: Boolean,
    val showAccountChip: Boolean,
)
