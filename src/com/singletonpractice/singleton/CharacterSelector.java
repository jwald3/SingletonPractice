package com.singletonpractice.singleton;

import com.singletonpractice.characters.Character;

public class CharacterSelector {
    private static CharacterSelector instance;
    private Character selectedCharacter;

    private CharacterSelector(){}

    public static CharacterSelector getInstance() {
        if (instance == null) {
            instance = new CharacterSelector();
        }
        return instance;
    }

    public void setSelectedCharacter(Character character) {
        this.selectedCharacter = character;
    }

    public Character getSelectedCharacter() {
        return this.selectedCharacter;
    }
}
