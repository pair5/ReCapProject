package com.etiya.ReCapProject.Utilities;


import com.etiya.ReCapProject.business.abstracts.WordService;
import com.etiya.ReCapProject.dataAccess.abstracts.LanguageDao;
import com.etiya.ReCapProject.dataAccess.abstracts.TranslationDao;
import com.etiya.ReCapProject.dataAccess.abstracts.WordDao;
import com.etiya.ReCapProject.entities.concretes.Language;
import com.etiya.ReCapProject.entities.concretes.Translation;
import com.etiya.ReCapProject.entities.concretes.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    WordDao wordDao;
    LanguageDao languageDao;
    TranslationDao translationDao;

    @Autowired
    public DataLoader(WordDao wordDao, LanguageDao languageDao, TranslationDao translationDao) {
        this.wordDao = wordDao;
        this.languageDao = languageDao;
        this.translationDao = translationDao;
    }
    @Override
    public void run(String... args) throws Exception {
            loadWordData();

    }

    private void loadWordData(){
        if (this.wordDao.count()==0){
            Word word = new Word();
            word.setKey("customer.added");
            Word word1 = new Word();
            word1.setKey("customer.deleted");
            Word word2 = new Word();
            word2.setKey("customer.updated");
            Word word4 = new Word();
            word4.setKey("customer.listed");
            Word word5 = new Word();
            word5.setKey("customer.get");
            Word word6 = new Word();
            word6.setKey("customer.not.found");
            Word word7 = new Word();
            word7.setKey("customer.already.exists.");
            Word word8 = new Word();
            word8.setKey("customers.taxnumber.already.exist");

            Word word9 = new Word();
            word9.setKey("brand.added");
            Word word10 = new Word();
            word10.setKey("brand.updated");
            Word word11 = new Word();
            word11.setKey("brand.deleted");
            Word word12 = new Word();
            word12.setKey("brand.listed");
            Word word13 = new Word();
            word13.setKey("brand.name.error");
            Word word14 = new Word();
            word14.setKey("brand.get");
            Word word15 = new Word();
            word15.setKey("brand.not.found");

            Word word16 = new Word();
            word16.setKey("car.added");
            Word word17 = new Word();
            word17.setKey("car.updated");
            Word word18 = new Word();
            word18.setKey("car.updated");
            Word word19 = new Word();
            word19.setKey("car.deleted");
            Word word20 = new Word();
            word20.setKey("car.listed");
            Word word21 = new Word();
            word21.setKey("car.get");
            Word word22 = new Word();
            word22.setKey("car.not.found");

            Word word23 = new Word();
            word23.setKey("city.added");
            Word word24 = new Word();
            word24.setKey("city.updated");
            Word word25 = new Word();
            word25.setKey("city.deleted");
            Word word26 = new Word();
            word26.setKey("city.listed");
            Word word27 = new Word();
            word27.setKey("city.not.found");
            Word word28 = new Word();
            word28.setKey("city.get");
            Word word30 = new Word();
            word30.setKey("city.already.exists");

            Word word31 = new Word();
            word31.setKey("color.added");
            Word word32 = new Word();
            word32.setKey("color.updated");
            Word word33 = new Word();
            word33.setKey("color.deleted");
            Word word34 = new Word();
            word34.setKey("color.listed");
            Word word35 = new Word();
            word35.setKey("color.get");
            Word colorAlreayExist = new Word();
            colorAlreayExist.setKey("color.already.exist");
            Word colorNotFound=new Word();
            colorNotFound.setKey("color.not.found");


            Word rentalAdd=new Word();
            rentalAdd.setKey("rental.added");
            Word rentalListed=new Word();
            rentalListed.setKey("rental.listed");
            Word rentalDeleted=new Word();
            rentalDeleted.setKey("rental.deleted");
            Word rentalDateError=new Word();
            rentalDateError.setKey("rental.date.error");
            Word rentalDateSuccess=new Word();
            rentalDateSuccess.setKey("rental.date.success");
            Word rentalFindexScoreError=new Word();
            rentalFindexScoreError.setKey("rental.findex.score.error");
            Word rentalMaintenanceError=new Word();
            rentalMaintenanceError.setKey("rental.maintenance.error");
            Word rentalGet=new Word();
            rentalGet.setKey("rental.maintenance.error");
            Word rentalNotFound=new Word();
            rentalNotFound.setKey("rental.not.found");
            Word rentalBalance=new Word();
            rentalBalance.setKey("rental.balance.insufficient");
            Word rentalDateisNull=new Word();
            rentalDateisNull.setKey("car.not.returnet");

            Word carImageAdd=new Word();
            carImageAdd.setKey("car.image.added");
            Word carImageUpdated=new Word();
            carImageUpdated.setKey("car.image.updated");
            Word carImageDeleted=new Word();
            carImageDeleted.setKey("car.image.deleted");
            Word carImageListed=new Word();
            carImageListed.setKey("car.image.listed");
            Word carImageLimitError=new Word();
            carImageLimitError.setKey("car.image.limit.error");
            Word carImageDefault=new Word();
            carImageDefault.setKey("car.image.default");
            Word carImageEmpty=new Word();
            carImageEmpty.setKey("car.image.empty");
            Word carImageTypeError=new Word();
            carImageTypeError.setKey("car.image.type.error");
            Word carImageGet=new Word();
            carImageGet.setKey("car.image.get");
            Word carImageNotFound=new Word();
            carImageNotFound.setKey("car.image.not.found");

            Word loginEmailError=new Word();
            loginEmailError.setKey("login.email.error");
            Word loginPasswordError=new Word();
            loginPasswordError.setKey("login.password.error");
            Word loginSuccess=new Word();
            loginSuccess.setKey("login.success");

            Word creditCardAdd=new Word();
            creditCardAdd.setKey("credit.card.add");
            Word creditCardUpdated=new Word();
            creditCardUpdated.setKey("credit.card.updated");
            Word creditCardDeleted=new Word();
            creditCardDeleted.setKey("credit.card.deleted");
            Word creditCardListed=new Word();
            creditCardListed.setKey("credit.card.listed");
            Word creditCardNumberError=new Word();
            creditCardNumberError.setKey("credit.card.number.error");
            Word creditCardDateError=new Word();
            creditCardDateError.setKey("credit.card.date.error");
            Word creditCardCvvError=new Word();
            creditCardCvvError.setKey("credit.card.cvv.error");
            Word creditCardSave=new Word();
            creditCardSave.setKey("credit.card.cvv.error");
            Word creditCardGet=new Word();
            creditCardGet.setKey("credit.card.get");
            Word creditCardNotSave=new Word();
            creditCardNotSave.setKey("credit.card.not.save");

            Word paymentAdd=new Word();
            paymentAdd.setKey("payment.add");
            Word paymentUpdated=new Word();
            paymentUpdated.setKey("payment.updated");
            Word paymentDeleted=new Word();
            paymentDeleted.setKey("payment.updated");
            Word paymentListed=new Word();
            paymentListed.setKey("payment.listed");
            Word paymentCardSave=new Word();
            paymentCardSave.setKey("payment.card.save");
            Word paymentCardNotSave=new Word();
            paymentCardNotSave.setKey("payment.card.save");
            Word paymentCardFail=new Word();
            paymentCardFail.setKey("payment.card.fail");

            Word invoiceAdd=new Word();
            invoiceAdd.setKey("invoice.add");
            Word invoiceUpdated=new Word();
            invoiceUpdated.setKey("invoice.updated");
            Word invoiceDeleted=new Word();
            invoiceDeleted.setKey("invoice.updated");
            Word invoiceListed=new Word();
            invoiceListed.setKey("invoice.listed");
            Word invoiceGet=new Word();
            invoiceGet.setKey("invoice.get");
            Word invoiceGetCustomer=new Word();
            invoiceGetCustomer.setKey("invoice.by.customer");



            Word userEmailAlreadyExists=new Word();
            userEmailAlreadyExists.setKey("user.email.already.exist");
            Word userFound=new Word();
            userFound.setKey("user.found");
            Word userNotFound=new Word();
            userNotFound.setKey("user.not.found");
            Word userListed=new Word();
            userListed.setKey("user.listed");






//3 ve 29 eksik




















            this.wordDao.save(word);
           this.wordDao.save(word1);
        }

    }

}

