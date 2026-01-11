package controller;

import app.SceneManager;
import model.Player;

public class LoginController {

    private static Player player;

    public static void login(String name) {
        if (name == null || name.trim().isEmpty()) return;

        player = new Player(name.trim());

        // ✅ KIRIM PLAYER KE QUIZ CONTROLLER
        QuizController.setPlayer(player);

        SceneManager.showMenu();
    }

    public static Player getPlayer() {
        return player;
    }
}
