package io.github.anass_abea.enumClasses;

import io.github.anass_abea.interf.Language;
import io.github.anass_abea.lang.Arabic;
import io.github.anass_abea.lang.EnglishDefault;
import io.github.anass_abea.lang.French;
import io.github.anass_abea.lang.German;

public enum Languages {
    English_US(new EnglishDefault()), French_FR(new French()),Arabic_AR(new Arabic()),German_DE(new German());
    final Language languageClass;
    Languages(Language languageClass){
        this.languageClass=languageClass;
    }
    public Language getLanguageClass(){
        return languageClass;
    }
}
