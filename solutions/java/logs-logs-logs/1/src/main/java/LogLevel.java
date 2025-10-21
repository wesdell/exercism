public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int codeLogLevel;

    LogLevel(int code) {
        this.codeLogLevel = code;
    }

    public int getCodeLogLevel() {
        return this.codeLogLevel;
    }
}
