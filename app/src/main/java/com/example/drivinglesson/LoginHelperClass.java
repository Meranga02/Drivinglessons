package com.example.drivinglesson;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class LoginHelperClass {
    String Email;
    String Password;
    String Mobile;

    public LoginHelperClass(String email, String password, String mobile) {
        Email = email;
        Password = password;
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public int length() {
        return Email.length();
    }

    public boolean isEmpty() {
        return Email.isEmpty();
    }

    public char charAt(int index) {
        return Email.charAt(index);
    }

    public int codePointAt(int index) {
        return Email.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return Email.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return Email.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return Email.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        Email.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        Email.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(@NonNull String charsetName) throws UnsupportedEncodingException {
        return Email.getBytes(charsetName);
    }

    public byte[] getBytes(@NonNull Charset charset) {
        return Email.getBytes(charset);
    }

    public byte[] getBytes() {
        return Email.getBytes();
    }

    public boolean contentEquals(@NonNull StringBuffer sb) {
        return Email.contentEquals(sb);
    }

    public boolean contentEquals(@NonNull CharSequence cs) {
        return Email.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(@Nullable String anotherString) {
        return Email.equalsIgnoreCase(anotherString);
    }

    public int compareTo(@NonNull String anotherString) {
        return Email.compareTo(anotherString);
    }

    public int compareToIgnoreCase(@NonNull String str) {
        return Email.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, @NonNull String other, int ooffset, int len) {
        return Email.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, @NonNull String other, int ooffset, int len) {
        return Email.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(@NonNull String prefix, int toffset) {
        return Email.startsWith(prefix, toffset);
    }

    public boolean startsWith(@NonNull String prefix) {
        return Email.startsWith(prefix);
    }

    public boolean endsWith(@NonNull String suffix) {
        return Email.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return Email.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return Email.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return Email.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return Email.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(@NonNull String str) {
        return Email.indexOf(str);
    }

    public int indexOf(@NonNull String str, int fromIndex) {
        return Email.indexOf(str, fromIndex);
    }

    public int lastIndexOf(@NonNull String str) {
        return Email.lastIndexOf(str);
    }

    public int lastIndexOf(@NonNull String str, int fromIndex) {
        return Email.lastIndexOf(str, fromIndex);
    }







    public boolean matches(@NonNull String regex) {
        return Email.matches(regex);
    }

    public boolean contains(@NonNull CharSequence s) {
        return Email.contains(s);
    }


}
