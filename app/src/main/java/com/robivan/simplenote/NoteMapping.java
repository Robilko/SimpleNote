package com.robivan.simplenote;

import java.util.Map;

public class NoteMapping {
    public static class Fields {

        public final static String NAME = "title";
        public final static String DESCRIPTION = "noteText";
        public final static String DATE = "date";
    }

    public static NoteEntity toNoteData(String id, Map<String, Object> doc) {
        NoteEntity answer = new NoteEntity((String) doc.get(Fields.NAME), (String) doc.get(Fields.DESCRIPTION), (long) doc.get(Fields.DATE));
        answer.setId(id);
        return answer;
    }
}
