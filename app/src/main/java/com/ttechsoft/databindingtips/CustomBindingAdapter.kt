package com.ttechsoft.databindingtips

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl", "fallBackResource")
fun loadImageUrl(view: ImageView, url: String, fallBackResource: Drawable) {
    Glide.with(view.context)
        .run {
            if (url.isNotEmpty()) {
                load(url)
            } else {
                load(fallBackResource)
            }
        }
        .into(view)
}
