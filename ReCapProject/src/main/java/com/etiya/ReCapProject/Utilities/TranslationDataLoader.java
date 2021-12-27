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

    }

    private void loadTranslationData(){

        var english = languageDao.getLanguagesByName("English");

        Translation customerAddedEnglishTranslation = new Translation();
        customerAddedEnglishTranslation.setLanguage(english);
        var customerAddedEnglish = this.wordDao.getWordsByKey("customer.added");
        customerAddedEnglishTranslation.setWord(customerAddedEnglish);
        customerAddedEnglishTranslation.setTranslation("Customer Added");

        Translation customerUpdatedEnglishTranslation = new Translation();
        customerUpdatedEnglishTranslation.setLanguage(english);
        var customerUpdatedEnglish = this.wordDao.getWordsByKey("customer.updated");
        customerUpdatedEnglishTranslation.setWord(customerUpdatedEnglish);
        customerUpdatedEnglishTranslation.setTranslation("Customer Updated");

        Translation customerDeletedEnglishTranslation = new Translation();
        customerDeletedEnglishTranslation.setLanguage(english);
        var customerDeletedEnglish = this.wordDao.getWordsByKey("customer.deleted");
        customerDeletedEnglishTranslation.setWord(customerDeletedEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customer Deleted");

        Translation customersFoundEnglishTranslation = new Translation();
        customersFoundEnglishTranslation.setLanguage(english);
        var customersFoundEnglish = this.wordDao.getWordsByKey("customers.listed");
        customerDeletedEnglishTranslation.setWord(customersFoundEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customers Listed");

        Translation customerFoundEnglishTranslation = new Translation();
        customersFoundEnglishTranslation.setLanguage(english);
        var customerFoundEnglish = this.wordDao.getWordsByKey("customer.found");
        customerDeletedEnglishTranslation.setWord(customersFoundEnglish);
        customerDeletedEnglishTranslation.setTranslation("Customers Found");

        Translation customerNotFoundEnglishTranslation = new Translation();
        customerNotFoundEnglishTranslation.setLanguage(english);
        var customerNotFoundEnglish = this.wordDao.getWordsByKey("customer.not.found");
        customerNotFoundEnglishTranslation.setWord(customerNotFoundEnglish);
        customerNotFoundEnglishTranslation.setTranslation("Customer Not Found");

        Translation customerAlreadyExistsEnglishTranslation = new Translation();
        customerAlreadyExistsEnglishTranslation.setLanguage(english);
        var customerAlreadyExistsEnglish = this.wordDao.getWordsByKey("customer.already.exists");
        customerAlreadyExistsEnglishTranslation.setWord(customerAlreadyExistsEnglish);
        customerAlreadyExistsEnglishTranslation.setTranslation("Customer already exists");


        var turkish = languageDao.getLanguagesByName("Turkish");

        Translation customerAddedTurkishTranslation = new Translation();
        customerAddedTurkishTranslation.setLanguage(turkish);
        var customerAddedTurkish = this.wordDao.getWordsByKey("customer.added");
        customerAddedTurkishTranslation.setWord(customerAddedTurkish);
        customerAddedTurkishTranslation.setTranslation("Müşteri eklendi.");

        Translation customerDeletedTurkishTranslation = new Translation();
        customerDeletedTurkishTranslation.setLanguage(turkish);
        var customerDeletedTurkish = this.wordDao.getWordsByKey("customer.deleted");
        customerDeletedTurkishTranslation.setWord(customerDeletedTurkish);
        customerDeletedTurkishTranslation.setTranslation("Müşteri silindi.");

        Translation customerUpdatedTurkishTranslation = new Translation();
        customerUpdatedTurkishTranslation.setLanguage(turkish);
        var customerUpdatedTurkish = this.wordDao.getWordsByKey("customer.updated");
        customerUpdatedTurkishTranslation.setWord(customerUpdatedTurkish);
        customerUpdatedTurkishTranslation.setTranslation("Müşteri güncellendi.");

        Translation customerFoundTurkishTranslation = new Translation();
        customerFoundTurkishTranslation.setLanguage(turkish);
        var customerFoundTurkish = this.wordDao.getWordsByKey("customer.found");
        customerFoundTurkishTranslation.setWord(customerFoundTurkish);
        customerFoundTurkishTranslation.setTranslation("Müşteri bulundu.");

        Translation customerNotFoundTurkishTranslation = new Translation();
        customerNotFoundTurkishTranslation.setLanguage(turkish);
        var customerNotFoundTurkish = this.wordDao.getWordsByKey("customer.not.found");
        customerNotFoundTurkishTranslation.setWord(customerNotFoundTurkish);
        customerNotFoundTurkishTranslation.setTranslation("Müşteri bulunamadı.");

        Translation customerAlreadyExistsTurkishTranslation = new Translation();
        customerAlreadyExistsTurkishTranslation.setLanguage(turkish);
        var customerAlreadyExistsTurkish = this.wordDao.getWordsByKey("customer.already.exists");
        customerAlreadyExistsTurkishTranslation.setWord(customerAlreadyExistsTurkish);
        customerAlreadyExistsTurkishTranslation.setTranslation("Müşteri zaten kayıtlı.");

        Translation customersTaxNumberAlreadyExistsTurkishTranslation = new Translation();
        customersTaxNumberAlreadyExistsTurkishTranslation.setLanguage(turkish);
        var customersTaxNumberAlreadyExistsTurkish = this.wordDao.getWordsByKey("customers.taxnumber.already.exists");
        customersTaxNumberAlreadyExistsTurkishTranslation.setWord(customerAlreadyExistsTurkish);
        customersTaxNumberAlreadyExistsTurkishTranslation.setTranslation("Müşterinin vergi numarası zaten kayıtlı.");

        Translation brandAddedTurkishTranslation = new Translation();
        brandAddedTurkishTranslation.setLanguage(turkish);
        var brandAddedTurkish = this.wordDao.getWordsByKey("marka.eklendi");
        brandAddedTurkishTranslation.setWord(brandAddedTurkish);
        brandAddedTurkishTranslation.setTranslation("Marka eklendi.");

        Translation brandDeletedTurkishTranslation = new Translation();
        brandDeletedTurkishTranslation.setLanguage(turkish);
        var brandDeletedTurkish = this.wordDao.getWordsByKey("marka.silindi");
        brandDeletedTurkishTranslation.setWord(brandDeletedTurkish);
        brandDeletedTurkishTranslation.setTranslation("Marka silindi.");

        Translation brandUpdatedTurkishTranslation = new Translation();
        brandUpdatedTurkishTranslation.setLanguage(turkish);
        var brandUpdatedTurkish = this.wordDao.getWordsByKey("marka.guncellendi");
        brandUpdatedTurkishTranslation.setWord(brandUpdatedTurkish);
        brandUpdatedTurkishTranslation.setTranslation("Marka güncellendi.");

        Translation brandListedTurkishTranslation = new Translation();
        brandListedTurkishTranslation.setLanguage(turkish);
        var brandListedTurkish = this.wordDao.getWordsByKey("marka.listelendi");
        brandListedTurkishTranslation.setWord(brandListedTurkish);
        brandListedTurkishTranslation.setTranslation("Marka listelendi.");

        Translation colorAddedTurkishTranslation = new Translation();
        colorAddedTurkishTranslation.setLanguage(turkish);
        var colorAddedTurkish = this.wordDao.getWordsByKey("color.added");
        colorAddedTurkishTranslation.setWord(colorAddedTurkish);
        colorAddedTurkishTranslation.setTranslation("Renk eklendi.");

        Translation colorDeletedTurkishTranslation = new Translation();
        colorDeletedTurkishTranslation.setLanguage(turkish);
        var colorDeletedTurkish = this.wordDao.getWordsByKey("color.deleted");
        colorDeletedTurkishTranslation.setWord(colorDeletedTurkish);
        colorDeletedTurkishTranslation.setTranslation("Renk silindi.");

        Translation colorUpdatedTurkishTranslation = new Translation();
        colorUpdatedTurkishTranslation.setLanguage(turkish);
        var colorUpdatedTurkish = this.wordDao.getWordsByKey("color.updated");
        colorUpdatedTurkishTranslation.setWord(colorUpdatedTurkish);
        colorUpdatedTurkishTranslation.setTranslation("Renk güncellendi.");

        Translation colorListedTurkishTranslation = new Translation();
        colorListedTurkishTranslation.setLanguage(turkish);
        var colorListedTurkish = this.wordDao.getWordsByKey("color.listed");
        colorListedTurkishTranslation.setWord(colorListedTurkish);
        colorListedTurkishTranslation.setTranslation("Renkler listelendi.");


        Translation colorNameErrorTurkishTranslation = new Translation();
        colorNameErrorTurkishTranslation.setLanguage(turkish);
        var colorNameErrorTurkish = this.wordDao.getWordsByKey("color.name.error");
        colorNameErrorTurkishTranslation.setWord(colorListedTurkish);
        colorNameErrorTurkishTranslation.setTranslation("Renk ismi hatalı.");

        Translation colorNotFoundTurkishTranslation = new Translation();
        colorNotFoundTurkishTranslation.setLanguage(turkish);
        var colorNotFoundTurkish = this.wordDao.getWordsByKey("color.not.found");
        colorNotFoundTurkishTranslation.setWord(colorListedTurkish);
        colorNotFoundTurkishTranslation.setTranslation("Renk bulunamadı.");

        Translation carImageAddedTurkishTranslation = new Translation();
        carImageAddedTurkishTranslation.setLanguage(turkish);
        var carImageAddedTurkish = this.wordDao.getWordsByKey("carImage.added");
        carImageAddedTurkishTranslation.setWord(carImageAddedTurkish);
        carImageAddedTurkishTranslation.setTranslation("Araç görseli eklendi.");

        Translation carImageDeletedTurkishTranslation = new Translation();
        carImageDeletedTurkishTranslation.setLanguage(turkish);
        var carImageDeletedTurkish = this.wordDao.getWordsByKey("carImage.deleted");
        carImageDeletedTurkishTranslation.setWord(carImageDeletedTurkish);
        carImageDeletedTurkishTranslation.setTranslation("Araç görseli silindi.");

        Translation carImageUpdatedTurkishTranslation = new Translation();
        carImageUpdatedTurkishTranslation.setLanguage(turkish);
        var carImageUpdatedTurkish = this.wordDao.getWordsByKey("carImage.updated");
        carImageUpdatedTurkishTranslation.setWord(carImageUpdatedTurkish);
        carImageUpdatedTurkishTranslation.setTranslation("Araç görseli güncellendi.");

        Translation carImageListedTurkishTranslation = new Translation();
        carImageListedTurkishTranslation.setLanguage(turkish);
        var carImageListedTurkish = this.wordDao.getWordsByKey("carImage.listed");
        carImageListedTurkishTranslation.setWord(carImageListedTurkish);
        carImageListedTurkishTranslation.setTranslation("Araç görselleri listelendi.");


        Translation carImageNameErrorTurkishTranslation = new Translation();
        carImageNameErrorTurkishTranslation.setLanguage(turkish);
        var carImageNameErrorTurkish = this.wordDao.getWordsByKey("carImage.name.error");
        carImageNameErrorTurkishTranslation.setWord(carImageListedTurkish);
        carImageNameErrorTurkishTranslation.setTranslation("Araç görsel ismi hatalı.");

        Translation carImageNotFoundTurkishTranslation = new Translation();
        carImageNotFoundTurkishTranslation.setLanguage(turkish);
        var carImageNotFoundTurkish = this.wordDao.getWordsByKey("carImage.not.found");
        carImageNotFoundTurkishTranslation.setWord(carImageListedTurkish);
        carImageNotFoundTurkishTranslation.setTranslation("Araç görseli bulunamadı.");

        Translation carAddedTurkishTranslation = new Translation();
        carAddedTurkishTranslation.setLanguage(turkish);
        var carAddedTurkish = this.wordDao.getWordsByKey("car.added");
        carAddedTurkishTranslation.setWord(carAddedTurkish);
        carAddedTurkishTranslation.setTranslation("Araç eklendi.");

        Translation carDeletedTurkishTranslation = new Translation();
        carDeletedTurkishTranslation.setLanguage(turkish);
        var carDeletedTurkish = this.wordDao.getWordsByKey("car.deleted");
        carDeletedTurkishTranslation.setWord(carDeletedTurkish);
        carDeletedTurkishTranslation.setTranslation("Araç silindi.");

        Translation carUpdatedTurkishTranslation = new Translation();
        carUpdatedTurkishTranslation.setLanguage(turkish);
        var carUpdatedTurkish = this.wordDao.getWordsByKey("car.updated");
        carUpdatedTurkishTranslation.setWord(carUpdatedTurkish);
        carUpdatedTurkishTranslation.setTranslation("Araç güncellendi.");

        Translation carListedTurkishTranslation = new Translation();
        carListedTurkishTranslation.setLanguage(turkish);
        var carListedTurkish = this.wordDao.getWordsByKey("car.listed");
        carListedTurkishTranslation.setWord(carListedTurkish);
        carListedTurkishTranslation.setTranslation("Araçlar listelendi.");


        Translation carNameErrorTurkishTranslation = new Translation();
        carNameErrorTurkishTranslation.setLanguage(turkish);
        var carNameErrorTurkish = this.wordDao.getWordsByKey("car.name.error");
        carNameErrorTurkishTranslation.setWord(carListedTurkish);
        carNameErrorTurkishTranslation.setTranslation("Araç ismi hatalı.");

        Translation carNotFoundTurkishTranslation = new Translation();
        carNotFoundTurkishTranslation.setLanguage(turkish);
        var carNotFoundTurkish = this.wordDao.getWordsByKey("car.not.found");
        carNotFoundTurkishTranslation.setWord(carListedTurkish);
        carNotFoundTurkishTranslation.setTranslation("Araç bulunamadı.");

        Translation rentalAddedTurkishTranslation = new Translation();
        rentalAddedTurkishTranslation.setLanguage(turkish);
        var rentalAddedTurkish = this.wordDao.getWordsByKey("rental.added");
        rentalAddedTurkishTranslation.setWord(rentalAddedTurkish);
        rentalAddedTurkishTranslation.setTranslation("Kiralama eklendi.");

        Translation rentalDeletedTurkishTranslation = new Translation();
        rentalDeletedTurkishTranslation.setLanguage(turkish);
        var rentalDeletedTurkish = this.wordDao.getWordsByKey("rental.deleted");
        rentalDeletedTurkishTranslation.setWord(rentalDeletedTurkish);
        rentalDeletedTurkishTranslation.setTranslation("Kiralama silindi.");

        Translation rentalUpdatedTurkishTranslation = new Translation();
        rentalUpdatedTurkishTranslation.setLanguage(turkish);
        var rentalUpdatedTurkish = this.wordDao.getWordsByKey("rental.updated");
        rentalUpdatedTurkishTranslation.setWord(rentalUpdatedTurkish);
        rentalUpdatedTurkishTranslation.setTranslation("Kiralama güncellendi.");

        Translation rentalListedTurkishTranslation = new Translation();
        rentalListedTurkishTranslation.setLanguage(turkish);
        var rentalListedTurkish = this.wordDao.getWordsByKey("rental.listed");
        rentalListedTurkishTranslation.setWord(rentalListedTurkish);
        rentalListedTurkishTranslation.setTranslation("Kiralama listelendi.");


        Translation rentalNameErrorTurkishTranslation = new Translation();
        rentalNameErrorTurkishTranslation.setLanguage(turkish);
        var rentalNameErrorTurkish = this.wordDao.getWordsByKey("rental.name.error");
        rentalNameErrorTurkishTranslation.setWord(rentalListedTurkish);
        rentalNameErrorTurkishTranslation.setTranslation("Kiralama ismi hatalı.");

        Translation rentalNotFoundTurkishTranslation = new Translation();
        rentalNotFoundTurkishTranslation.setLanguage(turkish);
        var rentalNotFoundTurkish = this.wordDao.getWordsByKey("rental.not.found");
        rentalNotFoundTurkishTranslation.setWord(rentalListedTurkish);
        rentalNotFoundTurkishTranslation.setTranslation("Kiralama bulunamadı.");

        Translation creditCardAddedTurkishTranslation = new Translation();
        creditCardAddedTurkishTranslation.setLanguage(turkish);
        var creditCardAddedTurkish = this.wordDao.getWordsByKey("creditCard.added");
        creditCardAddedTurkishTranslation.setWord(creditCardAddedTurkish);
        creditCardAddedTurkishTranslation.setTranslation("Kredi kartı eklendi.");

        Translation creditCardDeletedTurkishTranslation = new Translation();
        creditCardDeletedTurkishTranslation.setLanguage(turkish);
        var creditCardDeletedTurkish = this.wordDao.getWordsByKey("creditCard.deleted");
        creditCardDeletedTurkishTranslation.setWord(creditCardDeletedTurkish);
        creditCardDeletedTurkishTranslation.setTranslation("Kredi kartı silindi.");

        Translation creditCardUpdatedTurkishTranslation = new Translation();
        creditCardUpdatedTurkishTranslation.setLanguage(turkish);
        var creditCardUpdatedTurkish = this.wordDao.getWordsByKey("creditCard.updated");
        creditCardUpdatedTurkishTranslation.setWord(creditCardUpdatedTurkish);
        creditCardUpdatedTurkishTranslation.setTranslation("Kredi kartı güncellendi.");

        Translation creditCardListedTurkishTranslation = new Translation();
        creditCardListedTurkishTranslation.setLanguage(turkish);
        var creditCardListedTurkish = this.wordDao.getWordsByKey("creditCard.listed");
        creditCardListedTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardListedTurkishTranslation.setTranslation("Kredi kartları listelendi.");


        Translation creditCardNameErrorTurkishTranslation = new Translation();
        creditCardNameErrorTurkishTranslation.setLanguage(turkish);
        var creditCardNameErrorTurkish = this.wordDao.getWordsByKey("creditCard.name.error");
        creditCardNameErrorTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardNameErrorTurkishTranslation.setTranslation("Kredi kartı ismi hatalı.");

        Translation creditCardNotFoundTurkishTranslation = new Translation();
        creditCardNotFoundTurkishTranslation.setLanguage(turkish);
        var creditCardNotFoundTurkish = this.wordDao.getWordsByKey("creditCard.not.found");
        creditCardNotFoundTurkishTranslation.setWord(creditCardListedTurkish);
        creditCardNotFoundTurkishTranslation.setTranslation("Kredi kartı bulunamadı.");

        Translation invoiceAddedTurkishTranslation = new Translation();
        invoiceAddedTurkishTranslation.setLanguage(turkish);
        var invoiceAddedTurkish = this.wordDao.getWordsByKey("invoice.added");
        invoiceAddedTurkishTranslation.setWord(invoiceAddedTurkish);
        invoiceAddedTurkishTranslation.setTranslation("Fatura eklendi.");

        Translation invoiceDeletedTurkishTranslation = new Translation();
        invoiceDeletedTurkishTranslation.setLanguage(turkish);
        var invoiceDeletedTurkish = this.wordDao.getWordsByKey("invoice.deleted");
        invoiceDeletedTurkishTranslation.setWord(invoiceDeletedTurkish);
        invoiceDeletedTurkishTranslation.setTranslation("Fatura silindi.");

        Translation invoiceUpdatedTurkishTranslation = new Translation();
        invoiceUpdatedTurkishTranslation.setLanguage(turkish);
        var invoiceUpdatedTurkish = this.wordDao.getWordsByKey("invoice.updated");
        invoiceUpdatedTurkishTranslation.setWord(invoiceUpdatedTurkish);
        invoiceUpdatedTurkishTranslation.setTranslation("Fatura güncellendi.");

        Translation invoiceListedTurkishTranslation = new Translation();
        invoiceListedTurkishTranslation.setLanguage(turkish);
        var invoiceListedTurkish = this.wordDao.getWordsByKey("invoice.listed");
        invoiceListedTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceListedTurkishTranslation.setTranslation("Fatura listelendi.");


        Translation invoiceNameErrorTurkishTranslation = new Translation();
        invoiceNameErrorTurkishTranslation.setLanguage(turkish);
        var invoiceNameErrorTurkish = this.wordDao.getWordsByKey("invoice.name.error");
        invoiceNameErrorTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceNameErrorTurkishTranslation.setTranslation("Fatura ismi hatalı.");

        Translation invoiceNotFoundTurkishTranslation = new Translation();
        invoiceNotFoundTurkishTranslation.setLanguage(turkish);
        var invoiceNotFoundTurkish = this.wordDao.getWordsByKey("invoice.not.found");
        invoiceNotFoundTurkishTranslation.setWord(invoiceListedTurkish);
        invoiceNotFoundTurkishTranslation.setTranslation("Fatura bulunamadı.");

        Translation additionalServiceAddedTurkishTranslation = new Translation();
        additionalServiceAddedTurkishTranslation.setLanguage(turkish);
        var additionalServiceAddedTurkish = this.wordDao.getWordsByKey("additionalService.added");
        additionalServiceAddedTurkishTranslation.setWord(additionalServiceAddedTurkish);
        additionalServiceAddedTurkishTranslation.setTranslation("Ek Hizmet eklendi.");

        Translation additionalServiceDeletedTurkishTranslation = new Translation();
        additionalServiceDeletedTurkishTranslation.setLanguage(turkish);
        var additionalServiceDeletedTurkish = this.wordDao.getWordsByKey("additionalService.deleted");
        additionalServiceDeletedTurkishTranslation.setWord(additionalServiceDeletedTurkish);
        additionalServiceDeletedTurkishTranslation.setTranslation("Ek Hizmet silindi.");

        Translation additionalServiceUpdatedTurkishTranslation = new Translation();
        additionalServiceUpdatedTurkishTranslation.setLanguage(turkish);
        var additionalServiceUpdatedTurkish = this.wordDao.getWordsByKey("additionalService.updated");
        additionalServiceUpdatedTurkishTranslation.setWord(additionalServiceUpdatedTurkish);
        additionalServiceUpdatedTurkishTranslation.setTranslation("Ek Hizmet güncellendi.");

        Translation additionalServiceListedTurkishTranslation = new Translation();
        additionalServiceListedTurkishTranslation.setLanguage(turkish);
        var additionalServiceListedTurkish = this.wordDao.getWordsByKey("additionalService.listed");
        additionalServiceListedTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceListedTurkishTranslation.setTranslation("Ek Hizmet listelendi.");


        Translation additionalServiceNameErrorTurkishTranslation = new Translation();
        additionalServiceNameErrorTurkishTranslation.setLanguage(turkish);
        var additionalServiceNameErrorTurkish = this.wordDao.getWordsByKey("additionalService.name.error");
        additionalServiceNameErrorTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceNameErrorTurkishTranslation.setTranslation("Ek Hizmet ismi hatalı.");

        Translation additionalServiceNotFoundTurkishTranslation = new Translation();
        additionalServiceNotFoundTurkishTranslation.setLanguage(turkish);
        var additionalServiceNotFoundTurkish = this.wordDao.getWordsByKey("additionalService.not.found");
        additionalServiceNotFoundTurkishTranslation.setWord(additionalServiceListedTurkish);
        additionalServiceNotFoundTurkishTranslation.setTranslation("Ek Hizmet bulunamadı.");

        Translation userAddedTurkishTranslation = new Translation();
        userAddedTurkishTranslation.setLanguage(turkish);
        var userAddedTurkish = this.wordDao.getWordsByKey("user.added");
        userAddedTurkishTranslation.setWord(userAddedTurkish);
        userAddedTurkishTranslation.setTranslation("Kullanıcı eklendi.");

        Translation userDeletedTurkishTranslation = new Translation();
        userDeletedTurkishTranslation.setLanguage(turkish);
        var userDeletedTurkish = this.wordDao.getWordsByKey("user.deleted");
        userDeletedTurkishTranslation.setWord(userDeletedTurkish);
        userDeletedTurkishTranslation.setTranslation("Kullanıcı silindi.");

        Translation userUpdatedTurkishTranslation = new Translation();
        userUpdatedTurkishTranslation.setLanguage(turkish);
        var userUpdatedTurkish = this.wordDao.getWordsByKey("user.updated");
        userUpdatedTurkishTranslation.setWord(userUpdatedTurkish);
        userUpdatedTurkishTranslation.setTranslation("Kullanıcı güncellendi.");

        Translation userListedTurkishTranslation = new Translation();
        userListedTurkishTranslation.setLanguage(turkish);
        var userListedTurkish = this.wordDao.getWordsByKey("user.listed");
        userListedTurkishTranslation.setWord(userListedTurkish);
        userListedTurkishTranslation.setTranslation("Kullanıcı listelendi.");


        Translation userNameErrorTurkishTranslation = new Translation();
        userNameErrorTurkishTranslation.setLanguage(turkish);
        var userNameErrorTurkish = this.wordDao.getWordsByKey("user.name.error");
        userNameErrorTurkishTranslation.setWord(userListedTurkish);
        userNameErrorTurkishTranslation.setTranslation("Kullanıcı ismi hatalı.");

        Translation userNotFoundTurkishTranslation = new Translation();
        userNotFoundTurkishTranslation.setLanguage(turkish);
        var userNotFoundTurkish = this.wordDao.getWordsByKey("user.not.found");
        userNotFoundTurkishTranslation.setWord(userListedTurkish);
        userNotFoundTurkishTranslation.setTranslation("Kullanıcı bulunamadı.");

    }
}
