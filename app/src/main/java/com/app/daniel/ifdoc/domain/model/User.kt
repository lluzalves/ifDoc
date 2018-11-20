package com.app.daniel.ifdoc.domain.model

data class User(
        override var id: Int,
        override var created_at: String,
        override var updated_at: String,
        var name: String,
        var password: String,
        var token: String,
        var token_expiration_date: String,
        var email: String
) : BaseModel