package com.racingcar.view;

import com.racingcar.view.model.GameInputDto;

import java.util.Scanner;

public class InputView {
    public static GameInputDto drawAndParse() {
        GameInputDto input = new GameInputDto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        input.setNames(scanner.nextLine());

        System.out.println("시도할 횟수는 몇 회 인가요?");
        input.setGameRound(scanner.nextInt());

        System.out.println();

        return input;
    }
}
