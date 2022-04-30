package reversal;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversal {

    public static void reversal(List<?> list) {
        Collections.reverse(list);
    }

    public static void reversal(Class<?>[] texts) {
        List<Class<?>> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(String[] texts) {
        List<String> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Byte[] texts) {
        List<Byte> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Short[] texts) {
        List<Short> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Integer[] texts) {
        List<Integer> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Long[] texts) {
        List<Long> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Float[] texts) {
        List<Float> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Double[] texts) {
        List<Double> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Character[] texts) {
        List<Character> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(Boolean[] texts) {
        List<Boolean> list = Arrays.asList(texts);
        Collections.reverse(list);
    }

    public static void reversal(byte[] texts) {
        byte[] reversal = new byte[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(short[] texts) {
        short[] reversal = new short[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(int[] texts) {
        int[] reversal = new int[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(long[] texts) {
        long[] reversal = new long[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(float[] texts) {
        float[] reversal = new float[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(double[] texts) {
        double[] reversal = new double[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(char[] texts) {
        char[] reversal = new char[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

    public static void reversal(boolean[] texts) {
        boolean[] reversal = new boolean[texts.length];
        for (int i = texts.length-1, j = 0; i>=0; i--, j++) {
            reversal[j] = texts[i];
        } System.arraycopy(reversal, 0, texts, 0, texts.length);
    }

}
