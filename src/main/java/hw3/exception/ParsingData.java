package hw3.exception;

import java.util.LinkedHashMap;

public class ParsingData {
    public LinkedHashMap<String, Object> parsInputData() {
        InputData newData = new InputData();
        String[] tempData = new String[6]; // создаем массив как источника для дальнейшей записи в LinkedHashMap
        String[] data = newData.inputData();
        LinkedHashMap<String, Object> dataLinkedHashMap = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    tempData[5] = i;
                } else {
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexException(i);
                    }
                }
            } else if (i.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                String[] arrayDate = i.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                        Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 2023) {
                    try {
                        throw new DateException();
                    } catch (DateException e) {
                        e.dataException(i);
                    }
                } else {
                    if (Integer.parseInt(arrayDate[2]) % 4 == 0) {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 30) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[2]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }

                    }
                    if (!flag) {
                        tempData[3] = i;
                    } else try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(i);
                    }
                }

            } else if (i.matches("[0-9]+")) {
                tempData[4] = i;
            } else if (i.matches("[A-Za-z]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            tempData[0] = fullName[0];
            tempData[1] = fullName[1];
            tempData[2] = fullName[2];

        }
        boolean flag = true;
        for (int i = 0; i < tempData.length; i++) {
            if (tempData[i] == null) flag = false;
        }
        if (flag) { // последовательная запись в LinkedHashMap
            dataLinkedHashMap.put("Фамилия", tempData[0]);
            dataLinkedHashMap.put("Имя", tempData[1]);
            dataLinkedHashMap.put("Отчество", tempData[2]);
            dataLinkedHashMap.put("Дата рождения", tempData[3]);
            dataLinkedHashMap.put("Телефон", tempData[4]);
            dataLinkedHashMap.put("Пол", tempData[5]);
        }
        return dataLinkedHashMap;
    }
}
