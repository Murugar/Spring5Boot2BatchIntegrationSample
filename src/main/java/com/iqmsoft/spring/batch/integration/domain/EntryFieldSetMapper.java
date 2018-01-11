package com.iqmsoft.spring.batch.integration.domain;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class EntryFieldSetMapper implements FieldSetMapper<Entry> {

	@Override
	public Entry mapFieldSet(FieldSet fieldSet) throws BindException {

		final Entry entry = new Entry();

		entry.setSource(fieldSet.readString("source"));
		entry.setDestination(fieldSet.readString("destination"));
		entry.setAmount(fieldSet.readBigDecimal("amount"));
		entry.setDate(fieldSet.readDate("date"));
		entry.setType(fieldSet.readString("type"));

		return entry;
	}
}
