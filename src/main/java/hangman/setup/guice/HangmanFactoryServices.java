/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.English;
import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;
import hangman.model.PowerScore;
import hangman.model.GameScore;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
	bind(Language.class).to(English.class);
	bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
	bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
	bind(GameScore.class).to(PowerScore.class);
    }

}
