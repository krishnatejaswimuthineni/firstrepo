package com.cf.ims.constants;

import java.util.Arrays;

public enum Status {
    ACTIVE('A'), INACTIVE('I');


    private Character value;

        Status(final Character value) {
            this.value = value;
        }

        public static Status getByValue(final Character value) {
            return Arrays.stream(Status.values()).filter(status -> status.getValue().equals(value)).findFirst().get();
        }

        public Character getValue() {
            return this.value;
        }
    }

