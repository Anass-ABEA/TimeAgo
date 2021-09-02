package io.github.anass_abea.enumClasses;

import io.github.anass_abea.interf.Language;
import io.github.anass_abea.lang.EnglishDefault;
import io.github.anass_abea.lang.French;

public enum Languages {
    English_US(new EnglishDefault()), French_FR(new French());
    final Language languageClass;
    Languages(Language languageClass){
        this.languageClass=languageClass;
    }
    public Language getLanguageClass(){
        return languageClass;
    }
}
