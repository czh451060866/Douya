/*
 * Copyright (c) 2019 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.util

import android.content.Context
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.ArrayRes
import androidx.annotation.BoolRes
import androidx.annotation.DimenRes
import androidx.annotation.IntegerRes
import androidx.annotation.InterpolatorRes
import androidx.core.content.res.ResourcesCompat

fun Context.getBoolean(@BoolRes id: Int) = resources.getBoolean(id)

fun Context.getFloat(@DimenRes id: Int) = ResourcesCompat.getFloat(resources, id)

fun Context.getInteger(@IntegerRes id: Int) = resources.getInteger(id)

fun Context.getInterpolator(@InterpolatorRes id: Int) = AnimationUtils.loadInterpolator(this, id)

fun Context.getStringArray(@ArrayRes id: Int): Array<String> = resources.getStringArray(id)

val Context.shortAnimTime
    get() = getInteger(android.R.integer.config_shortAnimTime).toLong()

val Context.mediumAnimTime
    get() = getInteger(android.R.integer.config_mediumAnimTime).toLong()

val Context.longAnimTime
    get() = getInteger(android.R.integer.config_longAnimTime).toLong()

val Context.layoutInflater
    get() = LayoutInflater.from(this)

fun Context.showToast(textRes: Int, duration: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, textRes, duration).show()

fun Context.showToast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, text, duration).show()
