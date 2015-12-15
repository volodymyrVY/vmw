package com.softserveinc.ita.jexercises.common.entity.mongo;

import org.springframework.data.annotation.Id;
import java.math.BigInteger;

public abstract class BaseDocument {

    @Id
    private BigInteger documentId;

    public BigInteger getDocumentId() {
        return documentId;
    }

    public void setDocumentId(BigInteger documentId) {
        this.documentId = documentId;
    }

}
