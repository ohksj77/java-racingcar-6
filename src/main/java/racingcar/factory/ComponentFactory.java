package racingcar.factory;

import racingcar.controller.RacingCarController;
import racingcar.io.InputManager;
import racingcar.io.InputMapper;
import racingcar.io.InputValidator;
import racingcar.io.InputView;
import racingcar.io.OutputView;
import racingcar.repository.RacingCarsRepository;
import racingcar.service.RacingCarService;

public class ComponentFactory {

    public RacingCarController racingCarController() {
        return new RacingCarController(outputView(), inputManager(), racingCarService());
    }

    private RacingCarService racingCarService() {
        return new RacingCarService(racingCarsRepository());
    }

    private RacingCarsRepository racingCarsRepository() {
        return new RacingCarsRepository();
    }

    private InputManager inputManager() {
        return new InputManager(inputView(), inputMapper());
    }

    private InputMapper inputMapper() {
        return new InputMapper();
    }

    private InputView inputView() {
        return new InputView(inputValidator());
    }

    private InputValidator inputValidator() {
        return new InputValidator();
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
