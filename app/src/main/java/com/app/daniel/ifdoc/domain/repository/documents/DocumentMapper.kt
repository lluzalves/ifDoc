package com.app.daniel.ifdoc.domain.repository.documents

import com.app.daniel.ifdoc.data.entities.responses.DocumentEntity
import com.app.daniel.ifdoc.domain.model.Document

    internal fun DocumentEntity.toDocument() = Document(
            id = this.id,
            userId = this.userId,
            created_at = this.created_at,
            updated_at = this.updated_at,
            description = this.description,
            fileUrl = this.fileUrl,
            notification = this.notification
    )