package com.martynov.myvchat.utilits

import com.google.firebase.auth.FirebaseAuth


lateinit var AUTH: FirebaseAuth

const val NODE_USERS = "users"
const val CHILD_ID = "id"
const val CHILD_PHONE = "phone"
const val CHILD_USERNAME = "username"


fun initFirebase() {
    AUTH = FirebaseAuth.getInstance()
}