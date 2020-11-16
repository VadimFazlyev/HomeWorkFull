package Lesson08;
import javax.swing.*;


    class ComputerPlayer extends TicTacToe implements Runnable {
        public void run() {
            setCountOfMoves();
         /*
            Если количество ходов четное (признак хода компьтера), тогда инкрементируем количество ходов компьютера и
            вносим в соответствующую позицию массива ходов компьютера значение 1.
             */
            if (getCountOfMoves() % 2 == 0) {
                countOfMovesComputer++;
                computerMove = (int) (Math.random() * 10);
                while (computerMove == 0 || Moves.contains(computerMove)) {
                    if (countOfMovesComputer >= 5) break;
                    computerMove = (int) (Math.random() * 10);
                }
                add(computerMove);

                switch (computerMove) {
                    case 1: {
                        computer[0][0] = 1;
                        buttonA1.setFont(buttonFont);
                        buttonA1.setText("O");
                        buttonA1.setEnabled(false);
                        break;
                    }
                    case 2: {
                        computer[0][1] = 1;
                        buttonA2.setFont(buttonFont);
                        buttonA2.setText("O");
                        buttonA2.setEnabled(false);
                        break;
                    }
                    case 3: {
                        computer[0][2] = 1;
                        buttonA3.setFont(buttonFont);
                        buttonA3.setText("O");
                        buttonA3.setEnabled(false);
                        break;
                    }
                    case 4: {
                        computer[1][0] = 1;
                        buttonB1.setFont(buttonFont);
                        buttonB1.setText("O");
                        buttonB1.setEnabled(false);
                        break;
                    }
                    case 5: {
                        computer[1][1] = 1;
                        buttonB2.setFont(buttonFont);
                        buttonB2.setText("O");
                        buttonB2.setEnabled(false);
                        break;
                    }
                    case 6: {
                        computer[1][2] = 1;
                        buttonB3.setFont(buttonFont);
                        buttonB3.setText("O");
                        buttonB3.setEnabled(false);
                        break;
                    }
                    case 7: {
                        computer[2][0] = 1;
                        buttonC1.setFont(buttonFont);
                        buttonC1.setText("O");
                        buttonC1.setEnabled(false);
                        break;
                    }
                    case 8: {
                        computer[2][1] = 1;
                        buttonC2.setFont(buttonFont);
                        buttonC2.setText("O");
                        buttonC2.setEnabled(false);
                        break;
                    }
                    case 9: {
                        computer[2][2] = 1;
                        buttonC3.setFont(buttonFont);
                        buttonC3.setText("O");
                        buttonC3.setEnabled(false);
                        break;
                    }

                }
                // Если количество ходов компьютера больше 3, проверяем выиграл ли компьютер.
                if (countOfMovesComputer >= 3) {
                    if (statusOfComputer == 0) {
                        statusOfComputer = check(computer);
                    }
                }
            }
            if (statusOfComputer == 1) {
                result.setText("Вы проиграли QQ");
                for (JButton b : buttons) {
                    b.setEnabled(false);
                }
            } else if (statusOfComputer == 0 && countOfMovesComputer >= 5) {
                result.setText("Ничья!");
                for (JButton b : buttons) {
                    b.setEnabled(false);
                }
            }
        }
    }



