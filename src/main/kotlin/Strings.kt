package com.zenika.kt

fun reverse(s: String) = s.foldRight("") { c, acc -> acc.plus(c) }
