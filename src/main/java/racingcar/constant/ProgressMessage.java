package racingcar.constant;

public enum ProgressMessage {

    RACING_CAR_NAMES_REQUEST("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    private final String message;

    ProgressMessage(final String message) {
        this.message = message;
    }

    public String toValue() {
        return this.message;
    }
}
