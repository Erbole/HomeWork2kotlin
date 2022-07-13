package com.geektach.homework2.constancion

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: Int) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}