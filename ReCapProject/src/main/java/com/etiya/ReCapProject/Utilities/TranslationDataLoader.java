package com.etiya.ReCapProject.Utilities;

import com.etiya.ReCapProject.dataAccess.abstracts.LanguageDao;
import com.etiya.ReCapProject.dataAccess.abstracts.TranslationDao;
import com.etiya.ReCapProject.dataAccess.abstracts.WordDao;
import com.etiya.ReCapProject.entities.concretes.Translation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TranslationDataLoader implements CommandLineRunner {

    private TranslationDao translationDao;
    private LanguageDao languageDao;
    private WordDao wordDao;

    public TranslationDataLoader(TranslationDao translationDao, LanguageDao languageDao, WordDao wordDao) {
        this.translationDao = translationDao;
        this.languageDao = languageDao;
        this.wordDao = wordDao;
    }



    @Override
    public void run(String... args) throws Exception {
        loadTranslationData();
    }

    private void loadTranslationData(){

        var english = languageDao.getLanguagesByName("English");


        //-----Brand-------
        Translation brandAddedEnglishTranslation = new Translation();
        brandAddedEnglishTranslation.setLanguage(english);
        var brandAddedEnglish = this.wordDao.getWordsByKey("brand.added");
        brandAddedEnglishTranslation.setWord(brandAddedEnglish);
        brandAddedEnglishTranslation.setTranslation("Brand Added");
        this.translationDao.save(brandAddedEnglishTranslation);

        Translation brandUpdatedEnglishTranslation = new Translation();
        brandUpdatedEnglishTranslation.setLanguage(english);
        var brandUpdatedEnglish = this.wordDao.getWordsByKey("brand.updated");
        brandUpdatedEnglishTranslation.setWord(brandUpdatedEnglish);
        brandUpdatedEnglishTranslation.setTranslation("Brand updated");
        this.translationDao.save(brandUpdatedEnglishTranslation);

        Translation brandDeletedEnglishTranslation = new Translation();
        brandDeletedEnglishTranslation.setLanguage(english);
        var brandDeletedEnglish = this.wordDao.getWordsByKey("brand.deleted");
        brandDeletedEnglishTranslation.setWord(brandDeletedEnglish);
        brandDeletedEnglishTranslation.setTranslation("Brand Deleted");
        this.translationDao.save(brandDeletedEnglishTranslation);

        Translation brandsListedEnglishTranslation = new Translation();
        brandsListedEnglishTranslation.setLanguage(english);
        var brandsListedEnglish = this.wordDao.getWordsByKey("brands.listed");
        brandsListedEnglishTranslation.setWord(brandsListedEnglish);
        brandsListedEnglishTranslation.setTranslation("Brands Listed");
        this.translationDao.save(brandsListedEnglishTranslation);

        Translation brandFoundEnglishTranslation = new Translation();
        brandFoundEnglishTranslation.setLanguage(english);
        var brandfoundEnglish = this.wordDao.getWordsByKey("brand.found");
        brandFoundEnglishTranslation.setWord(brandfoundEnglish);
        brandFoundEnglishTranslation.setTranslation("Brands Listed");
        this.translationDao.save(brandFoundEnglishTranslation);

        Translation brandNotFoundEnglishTranslation = new Translation();
        brandNotFoundEnglishTranslation.setLanguage(english);
        var brandNotFoundEnglish = this.wordDao.getWordsByKey("brand.not.found");
        brandNotFoundEnglishTranslation.setWord(brandNotFoundEnglish);
        brandNotFoundEnglishTranslation.setTranslation("Brand Not Found");
        this.translationDao.save(brandNotFoundEnglishTranslation);


        Translation brandExistsEnglishTranslation = new Translation();
        brandExistsEnglishTranslation.setLanguage(english);
        var brandExistsEnglish = this.wordDao.getWordsByKey("brand.exists");
        brandExistsEnglishTranslation.setWord(brandExistsEnglish);
        brandExistsEnglishTranslation.setTranslation("Brand Exists");
        this.translationDao.save(brandExistsEnglishTranslation);

        //-------------Color-------------

        Translation colorAddedEnglishTranslation = new Translation();
        colorAddedEnglishTranslation.setLanguage(english);
        var colorAddedEnglish = this.wordDao.getWordsByKey("color.added");
        colorAddedEnglishTranslation.setWord(colorAddedEnglish);
        colorAddedEnglishTranslation.setTranslation("Color Added");
        this.translationDao.save(colorAddedEnglishTranslation);

        Translation colorUpdatedEnglishTranslation = new Translation();
        colorUpdatedEnglishTranslation.setLanguage(english);
        var colorUpdatedEnglish = this.wordDao.getWordsByKey("color.updated");
        colorUpdatedEnglishTranslation.setWord(colorUpdatedEnglish);
        colorUpdatedEnglishTranslation.setTranslation("Color Updated");
        this.translationDao.save(colorUpdatedEnglishTranslation);

        Translation colorDeletedEnglishTranslation = new Translation();
        colorDeletedEnglishTranslation.setLanguage(english);
        var colorDeletedEnglish = this.wordDao.getWordsByKey("color.deleted");
        colorDeletedEnglishTranslation.setWord(colorDeletedEnglish);
        colorDeletedEnglishTranslation.setTranslation("Color Deleted");
        this.translationDao.save(colorDeletedEnglishTranslation);



        Translation colorsListedEnglishTranslation = new Translation();
        colorsListedEnglishTranslation.setLanguage(english);
        var colorsListedEnglish = this.wordDao.getWordsByKey("colors.listed");
        colorsListedEnglishTranslation.setWord(colorsListedEnglish);
        colorsListedEnglishTranslation.setTranslation("Colors Listed");
        this.translationDao.save(colorsListedEnglishTranslation);


        Translation colorFoundEnglishTranslation = new Translation();
        colorFoundEnglishTranslation.setLanguage(english);
        var colorFoundEnglish = this.wordDao.getWordsByKey("color.found");
        colorFoundEnglishTranslation.setWord(colorFoundEnglish);
        colorFoundEnglishTranslation.setTranslation("Color Found");
        this.translationDao.save(colorFoundEnglishTranslation);

        Translation colorNotFoundEnglishTranslation = new Translation();
        colorNotFoundEnglishTranslation.setLanguage(english);
        var colorNotFoundEnglish = this.wordDao.getWordsByKey("color.not.found");
        colorNotFoundEnglishTranslation.setWord(colorNotFoundEnglish);
        colorNotFoundEnglishTranslation.setTranslation("Color Not Found");
        this.translationDao.save(colorNotFoundEnglishTranslation);

        Translation colorExistsEnglishTranslation = new Translation();
        colorExistsEnglishTranslation.setLanguage(english);
        var colorExistsEnglish = this.wordDao.getWordsByKey("color.exists");
        colorExistsEnglishTranslation.setWord(colorExistsEnglish);
        colorExistsEnglishTranslation.setTranslation("Color Exists");
        this.translationDao.save(colorExistsEnglishTranslation);

        //--------------------------Car--------------------------


        Translation carAddedEnglishTranslation = new Translation();
        carAddedEnglishTranslation.setLanguage(english);
        var carAddedEnglish = this.wordDao.getWordsByKey("car.added");
        carAddedEnglishTranslation.setWord(carAddedEnglish);
        carAddedEnglishTranslation.setTranslation("Car Added");
        this.translationDao.save(carAddedEnglishTranslation);

        Translation carUpdatedEnglishTranslation = new Translation();
        carUpdatedEnglishTranslation.setLanguage(english);
        var carUpdatedEnglish = this.wordDao.getWordsByKey("car.updated");
        carUpdatedEnglishTranslation.setWord(carUpdatedEnglish);
        carUpdatedEnglishTranslation.setTranslation("Car Updated");
        this.translationDao.save(carUpdatedEnglishTranslation);

        Translation carDeletedEnglishTranslation = new Translation();
        carDeletedEnglishTranslation.setLanguage(english);
        var carDeletedEnglish = this.wordDao.getWordsByKey("car.deleted");
        carDeletedEnglishTranslation.setWord(carDeletedEnglish);
        carDeletedEnglishTranslation.setTranslation("Car Deleted");
        this.translationDao.save(carDeletedEnglishTranslation);

        Translation carExistsEnglishTranslation = new Translation();
        carExistsEnglishTranslation.setLanguage(english);
        var carExistsEnglish = this.wordDao.getWordsByKey("car.exists");
        carExistsEnglishTranslation.setWord(carExistsEnglish);
        carExistsEnglishTranslation.setTranslation("Car Exists");
        this.translationDao.save(carExistsEnglishTranslation);

        Translation carFoundEnglishTranslation = new Translation();
        carFoundEnglishTranslation.setLanguage(english);
        var carFoundEnglish = this.wordDao.getWordsByKey("car.found");
        carFoundEnglishTranslation.setWord(carFoundEnglish);
        carFoundEnglishTranslation.setTranslation("Car Found");
        this.translationDao.save(carFoundEnglishTranslation);

        Translation carsListedEnglishTranslation = new Translation();
        carsListedEnglishTranslation.setLanguage(english);
        var carListedEnglish = this.wordDao.getWordsByKey("cars.listed");
        carsListedEnglishTranslation.setWord(carListedEnglish);
        carsListedEnglishTranslation.setTranslation("Cars Listed");
        this.translationDao.save(carsListedEnglishTranslation);

        Translation carNotFoundEnglishTranslation = new Translation();
        carNotFoundEnglishTranslation.setLanguage(english);
        var carNotFoundEnglish = this.wordDao.getWordsByKey("car.not.found");
        carNotFoundEnglishTranslation.setWord(carNotFoundEnglish);
        carNotFoundEnglishTranslation.setTranslation("Car Not Found");
        this.translationDao.save(carNotFoundEnglishTranslation);






        Translation customerAddedEnglishTranslation = new Translation();
        customerAddedEnglishTranslation.setLanguage(english);
        var customerAddedEnglish = this.wordDao.getWordsByKey("customer.added");
        customerAddedEnglishTranslation.setWord(customerAddedEnglish);
        customerAddedEnglishTranslation.setTranslation("Customer Added");
        this.translationDao.save(customerAddedEnglishTranslation);

        Translation customerUpdatedEnglishTranslation = new Translation();
        customerUpdatedEnglishTranslation.setLanguage(english);
        var customerUpdatedEnglish = this.wordDao.getWordsByKey("customer.updated");
        customerUpdatedEnglishTranslation.setWord(customerUpdatedEnglish);
        customerUpdatedEnglishTranslation.setTranslation("Customer Updated");
        this.translationDao.save(customerUpdatedEnglishTranslation);

        Translation customerDeletedEnglishTranslation = new Translation();
        customerDeletedEnglishTranslation.setLanguage(english);
        var customerDeletedEnglish = this.wordDao.getWordsByKey("customer.deleted");
        customerDeletedEnglishTranslation.setWord(customerDeletedEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customer Deleted");
        this.translationDao.save(customerDeletedEnglishTranslation);

        Translation customersFoundEnglishTranslation = new Translation();
        customersFoundEnglishTranslation.setLanguage(english);
        var customersFoundEnglish = this.wordDao.getWordsByKey("customers.listed");
        customerDeletedEnglishTranslation.setWord(customersFoundEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customers Listed");
        this.translationDao.save(customersFoundEnglishTranslation);

        Translation customerFoundEnglishTranslation = new Translation();
        customersFoundEnglishTranslation.setLanguage(english);
        var customerFoundEnglish = this.wordDao.getWordsByKey("customer.found");
        customerDeletedEnglishTranslation.setWord(customersFoundEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customers Found");
        this.translationDao.save(customerFoundEnglishTranslation);

        Translation customerNotFoundEnglishTranslation = new Translation();
        customerNotFoundEnglishTranslation.setLanguage(english);
        var customerNotFoundEnglish = this.wordDao.getWordsByKey("customer.not.found");
        customerNotFoundEnglishTranslation.setWord(customerNotFoundEnglish);
        customerNotFoundEnglishTranslation.setTranslation("Customer Not Found");
        this.translationDao.save(customerNotFoundEnglishTranslation);

        Translation customerAlreadyExistsEnglishTranslation = new Translation();
        customerAlreadyExistsEnglishTranslation.setLanguage(english);
        var customerAlreadyExistsEnglish = this.wordDao.getWordsByKey("customer.already.exists");
        customerAlreadyExistsEnglishTranslation.setWord(customerAlreadyExistsEnglish);
        customerAlreadyExistsEnglishTranslation.setTranslation("Customer already exists");
        this.translationDao.save(customerAlreadyExistsEnglishTranslation);

        Translation customerNationalIdentityAlreadyExistsEnglishTranslation = new Translation();
        customerNationalIdentityAlreadyExistsEnglishTranslation.setLanguage(english);
        var  customerNationalIdentityAlreadyExistsEnglish = this.wordDao.getWordsByKey("customer.national.identity.already.exists");
        customerNationalIdentityAlreadyExistsEnglishTranslation.setWord(customerNationalIdentityAlreadyExistsEnglish);
        customerNationalIdentityAlreadyExistsEnglishTranslation.setTranslation("Customer already exists");
        this.translationDao.save(customerNationalIdentityAlreadyExistsEnglishTranslation);

        Translation customerTaxNumberAlreadyExistsEnglishTranslation = new Translation();
        customerTaxNumberAlreadyExistsEnglishTranslation.setLanguage(english);
        var  customerTaxNumberAlreadyExistsEnglish = this.wordDao.getWordsByKey("customer.tax.number.already.exists");
        customerTaxNumberAlreadyExistsEnglishTranslation.setWord(customerTaxNumberAlreadyExistsEnglish);
        customerTaxNumberAlreadyExistsEnglishTranslation.setTranslation("Customer already exists");
        this.translationDao.save(customerTaxNumberAlreadyExistsEnglishTranslation);







        var turkish = languageDao.getLanguagesByName("Turkish");

        Translation customerAddedTurkishTranslation = new Translation();
        customerAddedTurkishTranslation.setLanguage(turkish);
        var customerAddedTurkish = this.wordDao.getWordsByKey("customer.added");
        customerAddedTurkishTranslation.setWord(customerAddedTurkish);
        customerAddedTurkishTranslation.setTranslation("Müşteri eklendi.");
        this.translationDao.save(customerAddedTurkishTranslation);

        Translation customerDeletedTurkishTranslation = new Translation();
        customerDeletedTurkishTranslation.setLanguage(turkish);
        var customerDeletedTurkish = this.wordDao.getWordsByKey("customer.deleted");
        customerDeletedTurkishTranslation.setWord(customerDeletedTurkish);
        customerDeletedTurkishTranslation.setTranslation("Müşteri silindi.");
        this.translationDao.save(customerDeletedTurkishTranslation);

        Translation customerUpdatedTurkishTranslation = new Translation();
        customerUpdatedTurkishTranslation.setLanguage(turkish);
        var customerUpdatedTurkish = this.wordDao.getWordsByKey("customer.updated");
        customerUpdatedTurkishTranslation.setWord(customerUpdatedTurkish);
        customerUpdatedTurkishTranslation.setTranslation("Müşteri güncellendi.");
        this.translationDao.save(customerUpdatedTurkishTranslation);

        Translation customerFoundTurkishTranslation = new Translation();
        customerFoundTurkishTranslation.setLanguage(turkish);
        var customerFoundTurkish = this.wordDao.getWordsByKey("customer.found");
        customerFoundTurkishTranslation.setWord(customerFoundTurkish);
        customerFoundTurkishTranslation.setTranslation("Müşteri bulundu.");
        this.translationDao.save(customerFoundTurkishTranslation);

        Translation customerNotFoundTurkishTranslation = new Translation();
        customerNotFoundTurkishTranslation.setLanguage(turkish);
        var customerNotFoundTurkish = this.wordDao.getWordsByKey("customer.not.found");
        customerNotFoundTurkishTranslation.setWord(customerNotFoundTurkish);
        customerNotFoundTurkishTranslation.setTranslation("Müşteri bulunamadı.");
        this.translationDao.save(customerNotFoundTurkishTranslation);

        Translation customerAlreadyExistsTurkishTranslation = new Translation();
        customerAlreadyExistsTurkishTranslation.setLanguage(turkish);
        var customerAlreadyExistsTurkish = this.wordDao.getWordsByKey("customer.already.exists");
        customerAlreadyExistsTurkishTranslation.setWord(customerAlreadyExistsTurkish);
        customerAlreadyExistsTurkishTranslation.setTranslation("Müşteri zaten kayıtlı.");
        this.translationDao.save(customerAlreadyExistsTurkishTranslation);

        Translation customersTaxNumberAlreadyExistsTurkishTranslation = new Translation();
        customersTaxNumberAlreadyExistsTurkishTranslation.setLanguage(turkish);
        var customersTaxNumberAlreadyExistsTurkish = this.wordDao.getWordsByKey("customers.taxnumber.already.exists");
        customersTaxNumberAlreadyExistsTurkishTranslation.setWord(customerAlreadyExistsTurkish);
        customersTaxNumberAlreadyExistsTurkishTranslation.setTranslation("Müşterinin vergi numarası zaten kayıtlı.");
        this.translationDao.save(customersTaxNumberAlreadyExistsTurkishTranslation);

        Translation brandAddedTurkishTranslation = new Translation();
        brandAddedTurkishTranslation.setLanguage(turkish);
        var brandAddedTurkish = this.wordDao.getWordsByKey("marka.eklendi");
        brandAddedTurkishTranslation.setWord(brandAddedTurkish);
        brandAddedTurkishTranslation.setTranslation("Marka eklendi.");
        this.translationDao.save(brandAddedTurkishTranslation);

        Translation brandDeletedTurkishTranslation = new Translation();
        brandDeletedTurkishTranslation.setLanguage(turkish);
        var brandDeletedTurkish = this.wordDao.getWordsByKey("marka.silindi");
        brandDeletedTurkishTranslation.setWord(brandDeletedTurkish);
        brandDeletedTurkishTranslation.setTranslation("Marka silindi.");
        this.translationDao.save(brandDeletedTurkishTranslation);

        Translation brandUpdatedTurkishTranslation = new Translation();
        brandUpdatedTurkishTranslation.setLanguage(turkish);
        var brandUpdatedTurkish = this.wordDao.getWordsByKey("marka.guncellendi");
        brandUpdatedTurkishTranslation.setWord(brandUpdatedTurkish);
        brandUpdatedTurkishTranslation.setTranslation("Marka güncellendi.");
        this.translationDao.save(brandUpdatedTurkishTranslation);

        Translation brandListedTurkishTranslation = new Translation();
        brandListedTurkishTranslation.setLanguage(turkish);
        var brandListedTurkish = this.wordDao.getWordsByKey("marka.listelendi");
        brandListedTurkishTranslation.setWord(brandListedTurkish);
        brandListedTurkishTranslation.setTranslation("Marka listelendi.");
        this.translationDao.save(brandListedTurkishTranslation);

        Translation colorAddedTurkishTranslation = new Translation();
        colorAddedTurkishTranslation.setLanguage(turkish);
        var colorAddedTurkish = this.wordDao.getWordsByKey("color.added");
        colorAddedTurkishTranslation.setWord(colorAddedTurkish);
        colorAddedTurkishTranslation.setTranslation("Renk eklendi.");
        this.translationDao.save(colorAddedTurkishTranslation);

        Translation colorDeletedTurkishTranslation = new Translation();
        colorDeletedTurkishTranslation.setLanguage(turkish);
        var colorDeletedTurkish = this.wordDao.getWordsByKey("color.deleted");
        colorDeletedTurkishTranslation.setWord(colorDeletedTurkish);
        colorDeletedTurkishTranslation.setTranslation("Renk silindi.");
        this.translationDao.save(colorDeletedTurkishTranslation);

        Translation colorUpdatedTurkishTranslation = new Translation();
        colorUpdatedTurkishTranslation.setLanguage(turkish);
        var colorUpdatedTurkish = this.wordDao.getWordsByKey("color.updated");
        colorUpdatedTurkishTranslation.setWord(colorUpdatedTurkish);
        colorUpdatedTurkishTranslation.setTranslation("Renk güncellendi.");
        this.translationDao.save(colorUpdatedTurkishTranslation);

        Translation colorListedTurkishTranslation = new Translation();
        colorListedTurkishTranslation.setLanguage(turkish);
        var colorListedTurkish = this.wordDao.getWordsByKey("color.listed");
        colorListedTurkishTranslation.setWord(colorListedTurkish);
        colorListedTurkishTranslation.setTranslation("Renkler listelendi.");
        this.translationDao.save(colorListedTurkishTranslation);


        Translation colorNameErrorTurkishTranslation = new Translation();
        colorNameErrorTurkishTranslation.setLanguage(turkish);
        var colorNameErrorTurkish = this.wordDao.getWordsByKey("color.name.error");
        colorNameErrorTurkishTranslation.setWord(colorListedTurkish);
        colorNameErrorTurkishTranslation.setTranslation("Renk ismi hatalı.");
        this.translationDao.save(colorNameErrorTurkishTranslation);

        Translation colorNotFoundTurkishTranslation = new Translation();
        colorNotFoundTurkishTranslation.setLanguage(turkish);
        var colorNotFoundTurkish = this.wordDao.getWordsByKey("color.not.found");
        colorNotFoundTurkishTranslation.setWord(colorListedTurkish);
        colorNotFoundTurkishTranslation.setTranslation("Renk bulunamadı.");
        this.translationDao.save(colorNotFoundTurkishTranslation);

        Translation carImageAddedTurkishTranslation = new Translation();
        carImageAddedTurkishTranslation.setLanguage(turkish);
        var carImageAddedTurkish = this.wordDao.getWordsByKey("carImage.added");
        carImageAddedTurkishTranslation.setWord(carImageAddedTurkish);
        carImageAddedTurkishTranslation.setTranslation("Araç görseli eklendi.");
        this.translationDao.save(carImageAddedTurkishTranslation);

        Translation carImageDeletedTurkishTranslation = new Translation();
        carImageDeletedTurkishTranslation.setLanguage(turkish);
        var carImageDeletedTurkish = this.wordDao.getWordsByKey("carImage.deleted");
        carImageDeletedTurkishTranslation.setWord(carImageDeletedTurkish);
        carImageDeletedTurkishTranslation.setTranslation("Araç görseli silindi.");
        this.translationDao.save(carImageDeletedTurkishTranslation);

        Translation carImageUpdatedTurkishTranslation = new Translation();
        carImageUpdatedTurkishTranslation.setLanguage(turkish);
        var carImageUpdatedTurkish = this.wordDao.getWordsByKey("carImage.updated");
        carImageUpdatedTurkishTranslation.setWord(carImageUpdatedTurkish);
        carImageUpdatedTurkishTranslation.setTranslation("Araç görseli güncellendi.");
        this.translationDao.save(carImageUpdatedTurkishTranslation);

        Translation carImageListedTurkishTranslation = new Translation();
        carImageListedTurkishTranslation.setLanguage(turkish);
        var carImageListedTurkish = this.wordDao.getWordsByKey("carImage.listed");
        carImageListedTurkishTranslation.setWord(carImageListedTurkish);
        carImageListedTurkishTranslation.setTranslation("Araç görselleri listelendi.");
        this.translationDao.save(carImageListedTurkishTranslation);


        Translation carImageNameErrorTurkishTranslation = new Translation();
        carImageNameErrorTurkishTranslation.setLanguage(turkish);
        var carImageNameErrorTurkish = this.wordDao.getWordsByKey("carImage.name.error");
        carImageNameErrorTurkishTranslation.setWord(carImageListedTurkish);
        carImageNameErrorTurkishTranslation.setTranslation("Araç görsel ismi hatalı.");
        this.translationDao.save(carImageNameErrorTurkishTranslation);

        Translation carImageNotFoundTurkishTranslation = new Translation();
        carImageNotFoundTurkishTranslation.setLanguage(turkish);
        var carImageNotFoundTurkish = this.wordDao.getWordsByKey("carImage.not.found");
        carImageNotFoundTurkishTranslation.setWord(carImageListedTurkish);
        carImageNotFoundTurkishTranslation.setTranslation("Araç görseli bulunamadı.");
        this.translationDao.save(carImageNotFoundTurkishTranslation);

        Translation carAddedTurkishTranslation = new Translation();
        carAddedTurkishTranslation.setLanguage(turkish);
        var carAddedTurkish = this.wordDao.getWordsByKey("car.added");
        carAddedTurkishTranslation.setWord(carAddedTurkish);
        carAddedTurkishTranslation.setTranslation("Araç eklendi.");
        this.translationDao.save(carAddedTurkishTranslation);

        Translation carDeletedTurkishTranslation = new Translation();
        carDeletedTurkishTranslation.setLanguage(turkish);
        var carDeletedTurkish = this.wordDao.getWordsByKey("car.deleted");
        carDeletedTurkishTranslation.setWord(carDeletedTurkish);
        carDeletedTurkishTranslation.setTranslation("Araç silindi.");
        this.translationDao.save(carDeletedTurkishTranslation);

        Translation carUpdatedTurkishTranslation = new Translation();
        carUpdatedTurkishTranslation.setLanguage(turkish);
        var carUpdatedTurkish = this.wordDao.getWordsByKey("car.updated");
        carUpdatedTurkishTranslation.setWord(carUpdatedTurkish);
        carUpdatedTurkishTranslation.setTranslation("Araç güncellendi.");
        this.translationDao.save(carUpdatedTurkishTranslation);

        Translation carListedTurkishTranslation = new Translation();
        carListedTurkishTranslation.setLanguage(turkish);
        var carListedTurkish = this.wordDao.getWordsByKey("car.listed");
        carListedTurkishTranslation.setWord(carListedTurkish);
        carListedTurkishTranslation.setTranslation("Araçlar listelendi.");
        this.translationDao.save(carListedTurkishTranslation);


        Translation carNameErrorTurkishTranslation = new Translation();
        carNameErrorTurkishTranslation.setLanguage(turkish);
        var carNameErrorTurkish = this.wordDao.getWordsByKey("car.name.error");
        carNameErrorTurkishTranslation.setWord(carListedTurkish);
        carNameErrorTurkishTranslation.setTranslation("Araç ismi hatalı.");
        this.translationDao.save(carNameErrorTurkishTranslation);

        Translation carNotFoundTurkishTranslation = new Translation();
        carNotFoundTurkishTranslation.setLanguage(turkish);
        var carNotFoundTurkish = this.wordDao.getWordsByKey("car.not.found");
        carNotFoundTurkishTranslation.setWord(carListedTurkish);
        carNotFoundTurkishTranslation.setTranslation("Araç bulunamadı.");
        this.translationDao.save(carNotFoundTurkishTranslation);

        Translation rentalAddedTurkishTranslation = new Translation();
        rentalAddedTurkishTranslation.setLanguage(turkish);
        var rentalAddedTurkish = this.wordDao.getWordsByKey("rental.added");
        rentalAddedTurkishTranslation.setWord(rentalAddedTurkish);
        rentalAddedTurkishTranslation.setTranslation("Kiralama eklendi.");
        this.translationDao.save(rentalAddedTurkishTranslation);

        Translation rentalDeletedTurkishTranslation = new Translation();
        rentalDeletedTurkishTranslation.setLanguage(turkish);
        var rentalDeletedTurkish = this.wordDao.getWordsByKey("rental.deleted");
        rentalDeletedTurkishTranslation.setWord(rentalDeletedTurkish);
        rentalDeletedTurkishTranslation.setTranslation("Kiralama silindi.");
        this.translationDao.save(rentalDeletedTurkishTranslation);

        Translation rentalUpdatedTurkishTranslation = new Translation();
        rentalUpdatedTurkishTranslation.setLanguage(turkish);
        var rentalUpdatedTurkish = this.wordDao.getWordsByKey("rental.updated");
        rentalUpdatedTurkishTranslation.setWord(rentalUpdatedTurkish);
        rentalUpdatedTurkishTranslation.setTranslation("Kiralama güncellendi.");
        this.translationDao.save(rentalUpdatedTurkishTranslation);

        Translation rentalListedTurkishTranslation = new Translation();
        rentalListedTurkishTranslation.setLanguage(turkish);
        var rentalListedTurkish = this.wordDao.getWordsByKey("rental.listed");
        rentalListedTurkishTranslation.setWord(rentalListedTurkish);
        rentalListedTurkishTranslation.setTranslation("Kiralama listelendi.");
        this.translationDao.save(rentalListedTurkishTranslation);


        Translation rentalNameErrorTurkishTranslation = new Translation();
        rentalNameErrorTurkishTranslation.setLanguage(turkish);
        var rentalNameErrorTurkish = this.wordDao.getWordsByKey("rental.name.error");
        rentalNameErrorTurkishTranslation.setWord(rentalListedTurkish);
        rentalNameErrorTurkishTranslation.setTranslation("Kiralama ismi hatalı.");
        this.translationDao.save(rentalNameErrorTurkishTranslation);

        Translation rentalNotFoundTurkishTranslation = new Translation();
        rentalNotFoundTurkishTranslation.setLanguage(turkish);
        var rentalNotFoundTurkish = this.wordDao.getWordsByKey("rental.not.found");
        rentalNotFoundTurkishTranslation.setWord(rentalListedTurkish);
        rentalNotFoundTurkishTranslation.setTranslation("Kiralama bulunamadı.");
        this.translationDao.save(rentalNotFoundTurkishTranslation);

        Translation creditCardAddedTurkishTranslation = new Translation();
        creditCardAddedTurkishTranslation.setLanguage(turkish);
        var creditCardAddedTurkish = this.wordDao.getWordsByKey("creditCard.added");
        creditCardAddedTurkishTranslation.setWord(creditCardAddedTurkish);
        creditCardAddedTurkishTranslation.setTranslation("Kredi kartı eklendi.");
        this.translationDao.save(creditCardAddedTurkishTranslation);

        Translation creditCardDeletedTurkishTranslation = new Translation();
        creditCardDeletedTurkishTranslation.setLanguage(turkish);
        var creditCardDeletedTurkish = this.wordDao.getWordsByKey("creditCard.deleted");
        creditCardDeletedTurkishTranslation.setWord(creditCardDeletedTurkish);
        creditCardDeletedTurkishTranslation.setTranslation("Kredi kartı silindi.");
        this.translationDao.save(creditCardDeletedTurkishTranslation);

        Translation creditCardUpdatedTurkishTranslation = new Translation();
        creditCardUpdatedTurkishTranslation.setLanguage(turkish);
        var creditCardUpdatedTurkish = this.wordDao.getWordsByKey("creditCard.updated");
        creditCardUpdatedTurkishTranslation.setWord(creditCardUpdatedTurkish);
        creditCardUpdatedTurkishTranslation.setTranslation("Kredi kartı güncellendi.");
        this.translationDao.save(creditCardUpdatedTurkishTranslation);

        Translation creditCardListedTurkishTranslation = new Translation();
        creditCardListedTurkishTranslation.setLanguage(turkish);
        var creditCardListedTurkish = this.wordDao.getWordsByKey("creditCard.listed");
        creditCardListedTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardListedTurkishTranslation.setTranslation("Kredi kartları listelendi.");
        this.translationDao.save(creditCardListedTurkishTranslation);


        Translation creditCardNameErrorTurkishTranslation = new Translation();
        creditCardNameErrorTurkishTranslation.setLanguage(turkish);
        var creditCardNameErrorTurkish = this.wordDao.getWordsByKey("creditCard.name.error");
        creditCardNameErrorTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardNameErrorTurkishTranslation.setTranslation("Kredi kartı ismi hatalı.");
        this.translationDao.save(creditCardNameErrorTurkishTranslation);

        Translation creditCardNotFoundTurkishTranslation = new Translation();
        creditCardNotFoundTurkishTranslation.setLanguage(turkish);
        var creditCardNotFoundTurkish = this.wordDao.getWordsByKey("creditCard.not.found");
        creditCardNotFoundTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardNotFoundTurkishTranslation.setTranslation("Kredi kartı bulunamadı.");
        this.translationDao.save(creditCardNotFoundTurkishTranslation);

        Translation invoiceAddedTurkishTranslation = new Translation();
        invoiceAddedTurkishTranslation.setLanguage(turkish);
        var invoiceAddedTurkish = this.wordDao.getWordsByKey("invoice.added");
        invoiceAddedTurkishTranslation.setWord(invoiceAddedTurkish);
        invoiceAddedTurkishTranslation.setTranslation("Fatura eklendi.");
        this.translationDao.save(invoiceAddedTurkishTranslation);

        Translation invoiceDeletedTurkishTranslation = new Translation();
        invoiceDeletedTurkishTranslation.setLanguage(turkish);
        var invoiceDeletedTurkish = this.wordDao.getWordsByKey("invoice.deleted");
        invoiceDeletedTurkishTranslation.setWord(invoiceDeletedTurkish);
        invoiceDeletedTurkishTranslation.setTranslation("Fatura silindi.");
        this.translationDao.save(invoiceDeletedTurkishTranslation);

        Translation invoiceUpdatedTurkishTranslation = new Translation();
        invoiceUpdatedTurkishTranslation.setLanguage(turkish);
        var invoiceUpdatedTurkish = this.wordDao.getWordsByKey("invoice.updated");
        invoiceUpdatedTurkishTranslation.setWord(invoiceUpdatedTurkish);
        invoiceUpdatedTurkishTranslation.setTranslation("Fatura güncellendi.");
        this.translationDao.save(invoiceUpdatedTurkishTranslation);

        Translation invoiceListedTurkishTranslation = new Translation();
        invoiceListedTurkishTranslation.setLanguage(turkish);
        var invoiceListedTurkish = this.wordDao.getWordsByKey("invoice.listed");
        invoiceListedTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceListedTurkishTranslation.setTranslation("Fatura listelendi.");
        this.translationDao.save(invoiceListedTurkishTranslation);


        Translation invoiceNameErrorTurkishTranslation = new Translation();
        invoiceNameErrorTurkishTranslation.setLanguage(turkish);
        var invoiceNameErrorTurkish = this.wordDao.getWordsByKey("invoice.name.error");
        invoiceNameErrorTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceNameErrorTurkishTranslation.setTranslation("Fatura ismi hatalı.");
        this.translationDao.save(invoiceNameErrorTurkishTranslation);

        Translation invoiceNotFoundTurkishTranslation = new Translation();
        invoiceNotFoundTurkishTranslation.setLanguage(turkish);
        var invoiceNotFoundTurkish = this.wordDao.getWordsByKey("invoice.not.found");
        invoiceNotFoundTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceNotFoundTurkishTranslation.setTranslation("Fatura bulunamadı.");
        this.translationDao.save(invoiceNotFoundTurkishTranslation);

        Translation additionalServiceAddedTurkishTranslation = new Translation();
        additionalServiceAddedTurkishTranslation.setLanguage(turkish);
        var additionalServiceAddedTurkish = this.wordDao.getWordsByKey("additionalService.added");
        additionalServiceAddedTurkishTranslation.setWord(additionalServiceAddedTurkish);
        additionalServiceAddedTurkishTranslation.setTranslation("Ek Hizmet eklendi.");
        this.translationDao.save(additionalServiceAddedTurkishTranslation);

        Translation additionalServiceDeletedTurkishTranslation = new Translation();
        additionalServiceDeletedTurkishTranslation.setLanguage(turkish);
        var additionalServiceDeletedTurkish = this.wordDao.getWordsByKey("additionalService.deleted");
        additionalServiceDeletedTurkishTranslation.setWord(additionalServiceDeletedTurkish);
        additionalServiceDeletedTurkishTranslation.setTranslation("Ek Hizmet silindi.");
        this.translationDao.save(additionalServiceDeletedTurkishTranslation);

        Translation additionalServiceUpdatedTurkishTranslation = new Translation();
        additionalServiceUpdatedTurkishTranslation.setLanguage(turkish);
        var additionalServiceUpdatedTurkish = this.wordDao.getWordsByKey("additionalService.updated");
        additionalServiceUpdatedTurkishTranslation.setWord(additionalServiceUpdatedTurkish);
        additionalServiceUpdatedTurkishTranslation.setTranslation("Ek Hizmet güncellendi.");
        this.translationDao.save(additionalServiceUpdatedTurkishTranslation);

        Translation additionalServiceListedTurkishTranslation = new Translation();
        additionalServiceListedTurkishTranslation.setLanguage(turkish);
        var additionalServiceListedTurkish = this.wordDao.getWordsByKey("additionalService.listed");
        additionalServiceListedTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceListedTurkishTranslation.setTranslation("Ek Hizmet listelendi.");
        this.translationDao.save(additionalServiceListedTurkishTranslation);


        Translation additionalServiceNameErrorTurkishTranslation = new Translation();
        additionalServiceNameErrorTurkishTranslation.setLanguage(turkish);
        var additionalServiceNameErrorTurkish = this.wordDao.getWordsByKey("additionalService.name.error");
        additionalServiceNameErrorTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceNameErrorTurkishTranslation.setTranslation("Ek Hizmet ismi hatalı.");
        this.translationDao.save(additionalServiceNameErrorTurkishTranslation);

        Translation additionalServiceNotFoundTurkishTranslation = new Translation();
        additionalServiceNotFoundTurkishTranslation.setLanguage(turkish);
        var additionalServiceNotFoundTurkish = this.wordDao.getWordsByKey("additionalService.not.found");
        additionalServiceNotFoundTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceNotFoundTurkishTranslation.setTranslation("Ek Hizmet bulunamadı.");
        this.translationDao.save(additionalServiceNotFoundTurkishTranslation);

        Translation userAddedTurkishTranslation = new Translation();
        userAddedTurkishTranslation.setLanguage(turkish);
        var userAddedTurkish = this.wordDao.getWordsByKey("user.added");
        userAddedTurkishTranslation.setWord(userAddedTurkish);
        userAddedTurkishTranslation.setTranslation("Kullanıcı eklendi.");
        this.translationDao.save(userAddedTurkishTranslation);

        Translation userDeletedTurkishTranslation = new Translation();
        userDeletedTurkishTranslation.setLanguage(turkish);
        var userDeletedTurkish = this.wordDao.getWordsByKey("user.deleted");
        userDeletedTurkishTranslation.setWord(userDeletedTurkish);
        userDeletedTurkishTranslation.setTranslation("Kullanıcı silindi.");
        this.translationDao.save(userAddedTurkishTranslation);

        Translation userUpdatedTurkishTranslation = new Translation();
        userUpdatedTurkishTranslation.setLanguage(turkish);
        var userUpdatedTurkish = this.wordDao.getWordsByKey("user.updated");
        userUpdatedTurkishTranslation.setWord(userUpdatedTurkish);
        userUpdatedTurkishTranslation.setTranslation("Kullanıcı güncellendi.");
        this.translationDao.save(userUpdatedTurkishTranslation);

        Translation userListedTurkishTranslation = new Translation();
        userListedTurkishTranslation.setLanguage(turkish);
        var userListedTurkish = this.wordDao.getWordsByKey("user.listed");
        userListedTurkishTranslation.setWord(userListedTurkish);
        userListedTurkishTranslation.setTranslation("Kullanıcı listelendi.");
        this.translationDao.save(userListedTurkishTranslation);


        Translation userNameErrorTurkishTranslation = new Translation();
        userNameErrorTurkishTranslation.setLanguage(turkish);
        var userNameErrorTurkish = this.wordDao.getWordsByKey("user.name.error");
        userNameErrorTurkishTranslation.setWord(userListedTurkish);
        userNameErrorTurkishTranslation.setTranslation("Kullanıcı ismi hatalı.");
        this.translationDao.save(userNameErrorTurkishTranslation);

        Translation userNotFoundTurkishTranslation = new Translation();
        userNotFoundTurkishTranslation.setLanguage(turkish);
        var userNotFoundTurkish = this.wordDao.getWordsByKey("user.not.found");
        userNotFoundTurkishTranslation.setWord(userListedTurkish);
        userNotFoundTurkishTranslation.setTranslation("Kullanıcı bulunamadı.");
        this.translationDao.save(userNotFoundTurkishTranslation);

    }
}
