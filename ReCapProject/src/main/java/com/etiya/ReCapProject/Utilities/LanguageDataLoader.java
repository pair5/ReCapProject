package com.etiya.ReCapProject.Utilities;

import com.etiya.ReCapProject.dataAccess.abstracts.LanguageDao;
import com.etiya.ReCapProject.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LanguageDataLoader implements CommandLineRunner {


    private LanguageDao languageDao;

    @Autowired
    public LanguageDataLoader(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }



    @Override
    public void run(String... args) throws Exception {

        loadLanguageData();
    }

    private void loadLanguageData(){
        Language language = new Language();
        language.setName("English");
        Language language1 = new Language();
        language1.setName("Turkish");
    }
}
