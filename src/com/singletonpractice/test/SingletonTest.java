package com.singletonpractice.test;

import com.singletonpractice.characters.Character;
import com.singletonpractice.singleton.CharacterSelector;

public class SingletonTest {
    public static void main(String[] args) {
        CharacterSelector characterSelector1 = CharacterSelector.getInstance();
        CharacterSelector characterSelector2 = CharacterSelector.getInstance();

        System.out.println("Are characterSelector1 and characterSelector2 the same instance? " +
                (characterSelector1 == characterSelector2));

        Character character = new Character("Warrior");

        characterSelector1.setSelectedCharacter(character);

        Character selectedCharacter = characterSelector2.getSelectedCharacter();
        System.out.println("Selected character: " + selectedCharacter.getName());
    }
}
