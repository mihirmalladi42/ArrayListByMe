import java.util.Arrays;
class ArrayList {
    int[] arrInt;
    double[] arrDouble;
    float[] arrFloat;
    boolean[] arrBoolean;
    char[] arrChar;
    long[] arrLong;
    short[] arrShort;
    byte[] arrByte;
    String[] arrString;
    boolean intBool, doubleBool, floatBool, booleanBool, charBool, longBool, shortBool, byteBool, stringBool;
    public ArrayList(String dataType) {
        if (dataType.equalsIgnoreCase("int")) {
            arrInt = new int[0];
            intBool = true;
        } else if (dataType.equalsIgnoreCase("double")) {
            arrDouble = new double[0];
            doubleBool = true;
        } else if (dataType.equalsIgnoreCase("float")) {
            arrFloat = new float[0];
            floatBool = true;
        } else if (dataType.equalsIgnoreCase("boolean")) {
            arrBoolean = new boolean[0];
            booleanBool = true;
        } else if (dataType.equalsIgnoreCase("char")) {
            arrChar = new char[0];
            charBool = true;
        } else if (dataType.equalsIgnoreCase("long")) {
            arrLong = new long[0];
            longBool = true;
        } else if (dataType.equalsIgnoreCase("short")) {
            arrShort = new short[0];
            shortBool = true;
        } else if (dataType.equalsIgnoreCase("byte")) {
            arrByte = new byte[0];
            byteBool = true;
        } else if (dataType.equalsIgnoreCase("String")) {
            arrString = new String[0];
            stringBool = true;
        }
    }
    public void add(int... n) {
        for (int nums : n) {
            int[] arrIntTemp = new int[arrInt.length];
            for (int i = 0; i < arrInt.length; i++) {
                arrIntTemp[i] = arrInt[i];
            }
            arrInt = new int[arrInt.length+1];
            for (int j = 0; j < arrIntTemp.length; j++) {
                arrInt[j] = arrIntTemp[j];
            }
            arrInt[arrInt.length-1] = nums;
        }
    }
    public void add(double... n) {
        for (double nums : n) {
            double[] arrDoubleTemp = new double[arrDouble.length];
            for (int i = 0; i < arrDouble.length; i++) {
                arrDoubleTemp[i] = arrDouble[i];
            }
            arrDouble = new double[arrDouble.length+1];
            for (int j = 0; j < arrDoubleTemp.length; j++) {
                arrDouble[j] = arrDoubleTemp[j];
            }
            arrDouble[arrDouble.length-1] = nums;
        }
    }
    public void add(float... n) {
        for (float nums : n) {
            float[] arrFloatTemp = new float[arrFloat.length];
            for (int i = 0; i < arrFloat.length; i++) {
                arrFloatTemp[i] = arrFloat[i];
            }
            arrFloat = new float[arrFloat.length+1];
            for (int j = 0; j < arrFloatTemp.length; j++) {
                arrFloat[j] = arrFloatTemp[j];
            }
            arrFloat[arrFloat.length-1] = nums;
        }
    }
    public void add(boolean... n) {
        for (boolean nums : n) {
            boolean[] arrBooleanTemp = new boolean[arrDouble.length];
            for (int i = 0; i < arrBoolean.length; i++) {
                arrBooleanTemp[i] = arrBoolean[i];
            }
            arrBoolean = new boolean[arrBoolean.length+1];
            for (int j = 0; j < arrBooleanTemp.length; j++) {
                arrBoolean[j] = arrBooleanTemp[j];
            }
            arrBoolean[arrBoolean.length-1] = nums;
        }
    }
    public void add(char... n) {
        for (char nums : n) {
            char[] arrCharTemp = new char[arrChar.length];
            for (int i = 0; i < arrChar.length; i++) {
                arrCharTemp[i] = arrChar[i];
            }
            arrChar = new char[arrChar.length+1];
            for (int j = 0; j < arrCharTemp.length; j++) {
                arrChar[j] = arrCharTemp[j];
            }
            arrChar[arrChar.length-1] = nums;
        }
    }
    public void add(long... n) {
        for (long nums : n) {
            long[] arrLongTemp = new long[arrLong.length];
            for (int i = 0; i < arrLong.length; i++) {
                arrLongTemp[i] = arrLong[i];
            }
            arrLong = new long[arrLong.length+1];
            for (int j = 0; j < arrLongTemp.length; j++) {
                arrLong[j] = arrLongTemp[j];
            }
            arrLong[arrLong.length-1] = nums;
        }
    }
    public void add(short... n) {
        for (short nums : n) {
            short[] arrShortTemp = new short[arrShort.length];
            for (int i = 0; i < arrShort.length; i++) {
                arrShortTemp[i] = arrShort[i];
            }
            arrShort = new short[arrShort.length+1];
            for (int j = 0; j < arrShortTemp.length; j++) {
                arrShort[j] = arrShortTemp[j];
            }
            arrShort[arrShort.length-1] = nums;
        }
    }
    public void add(byte... n) {
        for (byte nums : n) {
            byte[] arrByteTemp = new byte[arrByte.length];
            for (int i = 0; i < arrByte.length; i++) {
                arrByteTemp[i] = arrByte[i];
            }
            arrByte = new byte[arrByte.length+1];
            for (int j = 0; j < arrByteTemp.length; j++) {
                arrByte[j] = arrByteTemp[j];
            }
            arrByte[arrByte.length-1] = nums;
        }
    }
    public void add(String... n) {
        for (String nums : n) {
            String[] arrStringTemp = new String[arrString.length];
            for (int i = 0; i < arrString.length; i++) {
                arrStringTemp[i] = arrString[i];
            }
            arrString = new String[arrString.length+1];
            for (int j = 0; j < arrStringTemp.length; j++) {
                arrString[j] = arrStringTemp[j];
            }
            arrString[arrString.length-1] = nums;
        }
    }
    public void remove(int index) {
        if (intBool) {
           int[] arrIntTemp = new int[arrInt.length];
            int iterator = 0;
            for (int i = 0; i < arrInt.length; i++) {
                arrIntTemp[i] = arrInt[i];
            }
            arrInt = new int[arrInt.length-1];
            for (int j = 0; j < arrIntTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrInt[iterator] = arrIntTemp[j];
                    iterator++;
                }
            } 
        } else if (doubleBool) {
            double[] arrDoubleTemp = new double[arrDouble.length];
            int iterator = 0;
            for (int i = 0; i < arrDouble.length; i++) {
                arrDoubleTemp[i] = arrDouble[i];
            }
            arrDouble = new double[arrDouble.length-1];
            for (int j = 0; j < arrDoubleTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrDouble[iterator] = arrDoubleTemp[j];
                    iterator++;
                }
            } 
        } else if (floatBool) {
            float[] arrFloatTemp = new float[arrFloat.length];
            int iterator = 0;
            for (int i = 0; i < arrFloat.length; i++) {
                arrFloatTemp[i] = arrFloat[i];
            }
            arrFloat = new float[arrFloat.length-1];
            for (int j = 0; j < arrFloatTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrFloat[iterator] = arrFloatTemp[j];
                    iterator++;
                }
            } 
        } else if (booleanBool) {
            boolean[] arrBooleanTemp = new boolean[arrBoolean.length];
            int iterator = 0;
            for (int i = 0; i < arrBoolean.length; i++) {
                arrBooleanTemp[i] = arrBoolean[i];
            }
            arrBoolean = new boolean[arrBoolean.length-1];
            for (int j = 0; j < arrBooleanTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrBoolean[iterator] = arrBooleanTemp[j];
                    iterator++;
                }
            } 
        } else if (charBool) {
            char[] arrCharTemp = new char[arrChar.length];
            int iterator = 0;
            for (int i = 0; i < arrChar.length; i++) {
                arrCharTemp[i] = arrChar[i];
            }
            arrChar = new char[arrChar.length-1];
            for (int j = 0; j < arrCharTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrChar[iterator] = arrCharTemp[j];
                    iterator++;
                }
            } 
        } else if (longBool) {
            long[] arrLongTemp = new long[arrLong.length];
            int iterator = 0;
            for (int i = 0; i < arrLong.length; i++) {
                arrLongTemp[i] = arrLong[i];
            }
            arrLong = new long[arrLong.length-1];
            for (int j = 0; j < arrLongTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrLong[iterator] = arrLongTemp[j];
                    iterator++;
                }
            } 
        } else if (shortBool) {
            short[] arrShortTemp = new short[arrShort.length];
            int iterator = 0;
            for (int i = 0; i < arrShort.length; i++) {
                arrShortTemp[i] = arrShort[i];
            }
            arrShort = new short[arrShort.length-1];
            for (int j = 0; j < arrShortTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrShort[iterator] = arrShortTemp[j];
                    iterator++;
                }
            } 
        } else if (byteBool) {
            byte[] arrByteTemp = new byte[arrByte.length];
            int iterator = 0;
            for (int i = 0; i < arrByte.length; i++) {
                arrByteTemp[i] = arrByte[i];
            }
            arrByte = new byte[arrByte.length-1];
            for (int j = 0; j < arrByteTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrByte[iterator] = arrByteTemp[j];
                    iterator++;
                }
            } 
        } else if (stringBool) {
            String[] arrStringTemp = new String[arrString.length];
            int iterator = 0;
            for (int i = 0; i < arrString.length; i++) {
                arrStringTemp[i] = arrString[i];
            }
            arrString = new String[arrString.length-1];
            for (int j = 0; j < arrStringTemp.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arrString[iterator] = arrStringTemp[j];
                    iterator++;
                }
            } 
        }
    }
    public int get(int index, int empty) {
        return arrInt[index];
    }
    public double get(int index, double empty) {
        return arrDouble[index];
    }
    public float get(int index, float empty) {
        return arrFloat[index];
    }
    public boolean get(int index, boolean empty) {
        return arrBoolean[index];
    }
    public char get(int index, char empty) {
        return arrChar[index];
    }
    public long get(int index, long empty) {
        return arrLong[index];
    }
    public short get(int index, short empty) {
        return arrShort[index];
    }
    public byte get(int index, byte empty) {
        return arrByte[index];
    }
    public String get(int index, String empty) {
        return arrString[index];
    }
    public void set(int index, int num) {
        arrInt[index] = num;
    }
    public void set(int index, double num) {
        arrDouble[index] = num;
    }
    public void set(int index, float num) {
        arrFloat[index] = num;
    }
    public void set(int index, boolean statement) {
        arrBoolean[index] = statement;
    }
    public void set(int index, char character) {
        arrChar[index] = character;
    }
    public void set(int index, long num) {
        arrLong[index] = num;
    }
    public void set(int index, short num) {
        arrShort[index] = num;
    }
    public void set(int index, byte num) {
        arrByte[index] = num;
    }
    public void set(int index, String string) {
        arrString[index] = string;
    }
    public int size() {
        if (intBool) {
            return arrInt.length;
        } else if (doubleBool) {
            return arrDouble.length;
        } else if (floatBool) {
            return arrFloat.length;
        } else if (booleanBool) {
            return arrBoolean.length;
        } else if (charBool) {
            return arrChar.length;
        } else if (longBool) {
            return arrLong.length;
        } else if (shortBool) {
            return arrShort.length;
        } else if (byteBool) {
            return arrByte.length;
        } else if (stringBool) {
            return arrString.length;
        }
        return 0;
    }
    public boolean isEmpty() {
        if (intBool) {
            if (arrInt.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (doubleBool) {
            if (arrDouble.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (floatBool) {
            if (arrFloat.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (booleanBool) {
            if (arrBoolean.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (charBool) {
            if (arrChar.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (longBool) {
            if (arrLong.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (shortBool) {
            if (arrShort.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (byteBool) {
            if (arrByte.length < 1) {
                return true;
            } else {
                return false;
            }
        } else if (stringBool) {
            if (arrString.length < 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public void clear() {
        if (intBool) {
            arrInt = new int[0];
        } else if (doubleBool) {
            arrDouble = new double[0];
        } else if (floatBool) {
            arrFloat = new float[0];
        } else if (booleanBool) {
            arrBoolean = new boolean[0];
        } else if (charBool) {
            arrChar = new char[0];
        } else if (longBool) {
            arrLong = new long[0];
        } else if (shortBool) {
            arrShort = new short[0];
        } else if (byteBool) {
            arrByte = new byte[0];
        } else if (stringBool) {
            arrString = new String[0];
        }
    }
    public boolean contains(int e) {
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(double e) {
        for (int i = 0; i < arrDouble.length; i++) {
            if (arrDouble[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(float e) {
        for (int i = 0; i < arrFloat.length; i++) {
            if (arrFloat[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(boolean e) {
        for (int i = 0; i < arrBoolean.length; i++) {
            if (arrBoolean[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(char e) {
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(long e) {
        for (int i = 0; i < arrLong.length; i++) {
            if (arrLong[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(short e) {
        for (int i = 0; i < arrShort.length; i++) {
            if (arrShort[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(byte e) {
        for (int i = 0; i < arrByte.length; i++) {
            if (arrByte[i] == e) {
                return true;
            }
        }
        return false;
    }
    public boolean contains(String e) {
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    public void print() {
        if (intBool) {
            System.out.println(Arrays.toString(arrInt));
        } else if (doubleBool) {
            System.out.println(Arrays.toString(arrDouble));
        } else if (floatBool) {
            System.out.println(Arrays.toString(arrFloat));
        } else if (booleanBool) {
            System.out.println(Arrays.toString(arrBoolean));
        } else if (charBool) {
            System.out.println(Arrays.toString(arrChar));
        } else if (longBool) {
            System.out.println(Arrays.toString(arrLong));
        } else if (shortBool) {
            System.out.println(Arrays.toString(arrShort));
        } else if (byteBool) {
            System.out.println(Arrays.toString(arrByte));
        } else if (stringBool) {
            System.out.println(Arrays.toString(arrString));
        }
    }
}
