package io.ghostwriter.rt.tracer;


import io.ghostwriter.rt.tracer.writer.TracerWriter;

public class StringTracerWriter implements TracerWriter {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void writeEntering(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public void writeReturning(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public void writeExiting(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public void writeValueChange(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public void writeError(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public void writeTimeout(Object source, String msg) {
        sb.append(msg);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

}
