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
            Word customerAdded = new Word();
            customerAdded.setKey("customer.added");
            this.wordDao.save(customerAdded);
            Word customerDeleted = new Word();
            customerDeleted.setKey("customer.deleted");
            this.wordDao.save(customerDeleted);
            Word customerUpdated = new Word();
            customerUpdated.setKey("customer.updated");
            this.wordDao.save(customerUpdated);
            Word customerListed = new Word();
            customerListed.setKey("customer.listed");
            this.wordDao.save(customerListed);
            Word customerGet = new Word();
            customerGet.setKey("customer.found");
            this.wordDao.save(customerGet);
            Word customerNotFound = new Word();
            customerNotFound.setKey("customer.not.found");
            this.wordDao.save(customerNotFound);
            Word customerAlreadyExists = new Word();
            customerAlreadyExists.setKey("customer.already.exists.");
            this.wordDao.save(customerAlreadyExists);
            Word customersTaxNumberAlreadyExists = new Word();
            customersTaxNumberAlreadyExists.setKey("customers.taxnumber.already.exists");
            this.wordDao.save(customersTaxNumberAlreadyExists);

            Word brandAdded = new Word();
            brandAdded.setKey("brand.added");
            this.wordDao.save(brandAdded);
            Word brandUpdated = new Word();
            brandUpdated.setKey("brand.updated");
            this.wordDao.save(brandUpdated);
            Word brandDeleted =new Word();
            brandDeleted.setKey("brand.deleted");
            this.wordDao.save(brandDeleted);
            Word brandListed = new Word();
            brandListed.setKey("brand.listed");
            this.wordDao.save(brandListed);
            Word brandNotFound = new Word();
            brandNotFound.setKey("brand.not.found");
            this.wordDao.save(brandNotFound);
            Word brandFound = new Word();
            brandFound.setKey("brand.found");
            this.wordDao.save(brandFound);
            Word brandExists = new Word();
            brandExists.setKey("brand.exists");
            this.wordDao.save(brandExists);



            Word carAdded = new Word();
            carAdded.setKey("car.added");
            this.wordDao.save(carAdded);
            Word carUpdated = new Word();
            carUpdated.setKey("car.updated");
            this.wordDao.save(carUpdated);
            Word carDeleted = new Word();
            carDeleted.setKey("car.deleted");
            this.wordDao.save(carDeleted);
            Word carListed = new Word();
            carListed.setKey("car.listed");
            this.wordDao.save(carListed);
            Word carGet = new Word();
            carGet.setKey("car.found");
            this.wordDao.save(carGet);
            Word carNotFound = new Word();
            carNotFound.setKey("car.not.found");
            this.wordDao.save(carNotFound);

            Word cityAdded = new Word();
            cityAdded.setKey("city.added");
            this.wordDao.save(carAdded);
            Word cityUpdated = new Word();
            cityUpdated.setKey("city.updated");
            this.wordDao.save(cityUpdated);
            Word cityDeleted = new Word();
            cityDeleted.setKey("city.deleted");
            this.wordDao.save(cityDeleted);
            Word cityListed = new Word();
            cityListed.setKey("city.listed");
            this.wordDao.save(cityListed);
            Word cityNotFound = new Word();
            cityNotFound.setKey("city.not.found");
            this.wordDao.save(cityNotFound);
            Word cityGet = new Word();
            cityGet.setKey("city.found");
            this.wordDao.save(cityGet);
            Word cityAlreadyExists = new Word();
            cityAlreadyExists.setKey("city.already.exists");
            this.wordDao.save(cityAlreadyExists);

            Word colorAdded = new Word();
            colorAdded.setKey("color.added");
            this.wordDao.save(colorAdded);
            Word colorUpdated=new Word();
            colorUpdated.setKey("color.updated");
            this.wordDao.save(colorUpdated);
            Word colorDeleted = new Word();
            colorDeleted.setKey("color.deleted");
            this.wordDao.save(colorDeleted);
            Word colorListed = new Word();
            colorListed.setKey("color.listed");
            this.wordDao.save(colorListed);
            Word colorGet = new Word();
            colorGet.setKey("color.found");
            this.wordDao.save(colorGet);

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
            this.wordDao.save(colorAlreayExist);
            Word colorNotFound=new Word();
            colorNotFound.setKey("color.not.found");
            this.wordDao.save(colorNotFound);



            Word rentalAdd=new Word();
            rentalAdd.setKey("rental.added");
            this.wordDao.save(rentalAdd);
            Word rentalListed=new Word();
            rentalListed.setKey("rental.listed");
            this.wordDao.save(rentalListed);
            Word rentalDeleted=new Word();
            rentalDeleted.setKey("rental.deleted");
            this.wordDao.save(rentalDeleted);
            Word rentalDateError=new Word();
            rentalDateError.setKey("rental.date.error");
            this.wordDao.save(rentalDateError);
            Word rentalDateSuccess=new Word();
            rentalDateSuccess.setKey("rental.date.success");
            this.wordDao.save(rentalDateSuccess);
            Word rentalFindexScoreError=new Word();
            rentalFindexScoreError.setKey("rental.findex.score.error");
            this.wordDao.save(rentalFindexScoreError);
            Word rentalMaintenanceError=new Word();
            rentalMaintenanceError.setKey("rental.maintenance.error");
            this.wordDao.save(rentalMaintenanceError);
            Word rentalGet=new Word();
            rentalGet.setKey("rental.maintenance.error");
            this.wordDao.save(rentalGet);
            Word rentalNotFound=new Word();
            rentalNotFound.setKey("rental.not.found");
            this.wordDao.save(rentalNotFound);
            Word rentalBalance=new Word();
            rentalBalance.setKey("rental.balance.insufficient");
            this.wordDao.save(rentalBalance);
            Word rentalDateisNull=new Word();
            rentalDateisNull.setKey("car.not.returnet");
            this.wordDao.save(rentalDateisNull);

            Word carImageAdd=new Word();
            carImageAdd.setKey("car.image.added");
            this.wordDao.save(carImageAdd);
            Word carImageUpdated=new Word();
            carImageUpdated.setKey("car.image.updated");
            this.wordDao.save(carImageUpdated);
            Word carImageDeleted=new Word();
            carImageDeleted.setKey("car.image.deleted");
            this.wordDao.save(carImageDeleted);
            Word carImageListed=new Word();
            carImageListed.setKey("car.image.listed");
            this.wordDao.save(carImageListed);
            Word carImageLimitError=new Word();
            carImageLimitError.setKey("car.image.limit.error");
            this.wordDao.save(carImageDeleted);
            Word carImageDefault=new Word();
            carImageDefault.setKey("car.image.default");
            this.wordDao.save(carImageDefault);
            Word carImageEmpty=new Word();
            carImageEmpty.setKey("car.image.empty");
            this.wordDao.save(carImageEmpty);
            Word carImageTypeError=new Word();
            carImageTypeError.setKey("car.image.type.error");
            this.wordDao.save(carImageEmpty);
            Word carImageGet=new Word();
            carImageGet.setKey("car.image.found");
            this.wordDao.save(carImageGet);
            Word carImageNotFound=new Word();
            carImageNotFound.setKey("car.image.not.found");
            this.wordDao.save(carImageNotFound);

            Word loginEmailError=new Word();
            loginEmailError.setKey("login.email.error");
            this.wordDao.save(loginEmailError);
            Word loginPasswordError=new Word();
            loginPasswordError.setKey("login.password.error");
            this.wordDao.save(loginPasswordError);
            Word loginSuccess=new Word();
            loginSuccess.setKey("login.success");
            this.wordDao.save(loginSuccess);

            Word creditCardAdd=new Word();
            creditCardAdd.setKey("credit.card.add");
            this.wordDao.save(creditCardAdd);
            Word creditCardUpdated=new Word();
            creditCardUpdated.setKey("credit.card.updated");
            this.wordDao.save(creditCardUpdated);
            Word creditCardDeleted=new Word();
            creditCardDeleted.setKey("credit.card.deleted");
            this.wordDao.save(creditCardDeleted);
            Word creditCardListed=new Word();
            creditCardListed.setKey("credit.card.listed");
            this.wordDao.save(creditCardListed);
            Word creditCardNumberError=new Word();
            creditCardNumberError.setKey("credit.card.number.error");
            this.wordDao.save(creditCardNumberError);
            Word creditCardDateError=new Word();
            creditCardDateError.setKey("credit.card.date.error");
            this.wordDao.save(creditCardDateError);
            Word creditCardCvvError=new Word();
            creditCardCvvError.setKey("credit.card.cvv.error");
            this.wordDao.save(creditCardCvvError);
            Word creditCardSave=new Word();
            creditCardSave.setKey("credit.card.registered");
            this.wordDao.save(creditCardSave);
            Word creditCardGet=new Word();
            creditCardGet.setKey("credit.card.found");
            this.wordDao.save(creditCardGet);
            Word creditCardNotSave=new Word();
            creditCardNotSave.setKey("credit.card.not.save");
            this.wordDao.save(creditCardNotSave);

            Word paymentAdded=new Word();
            paymentAdded.setKey("payment.add");
            this.wordDao.save(paymentAdded);
            Word paymentUpdated=new Word();
            paymentUpdated.setKey("payment.updated");
            this.wordDao.save(paymentUpdated);
            Word paymentDeleted=new Word();
            paymentDeleted.setKey("payment.deleted");
            this.wordDao.save(paymentDeleted);
            Word paymentsListed=new Word();
            paymentsListed.setKey("payments.listed");
            this.wordDao.save(paymentsListed);
            Word paymentCardSave=new Word();
            creditCardSave.setKey("credit.card.saved");
            this.wordDao.save(creditCardSave);
            Word paymentCardNotSave=new Word();
            paymentCardNotSave.setKey("credit.card.not.saved");
            this.wordDao.save(paymentCardNotSave);
            Word creditCardFail=new Word();
            creditCardFail.setKey("payment.card.fail");
            this.wordDao.save(creditCardFail);

            Word invoiceAdd=new Word();
            invoiceAdd.setKey("invoice.add");
            this.wordDao.save(invoiceAdd);
            Word invoiceUpdated=new Word();
            invoiceUpdated.setKey("invoice.updated");
            this.wordDao.save(invoiceUpdated);
            Word invoiceDeleted=new Word();
            invoiceDeleted.setKey("invoice.updated");
            this.wordDao.save(invoiceDeleted);
            Word invoiceListed=new Word();
            invoiceListed.setKey("invoice.listed");
            this.wordDao.save(invoiceListed);
            Word invoiceGet=new Word();
            invoiceGet.setKey("invoice.found");
            this.wordDao.save(invoiceGet);
            Word invoiceGetCustomer=new Word();
            invoiceGetCustomer.setKey("invoice.by.customer");
            this.wordDao.save(invoiceGetCustomer);


            Word userEmailAlreadyExists=new Word();
            userEmailAlreadyExists.setKey("user.email.already.exist");
            this.wordDao.save(userEmailAlreadyExists);
            Word userFound=new Word();
            userFound.setKey("user.found");
            this.wordDao.save(userFound);
            Word userNotFound=new Word();
            userNotFound.setKey("user.not.found");
            this.wordDao.save(userNotFound);
            Word userListed=new Word();
            userListed.setKey("user.listed");
            this.wordDao.save(userListed);

            Word damageAdd=new Word();
            damageAdd.setKey("damage.added");
            this.wordDao.save(damageAdd);
            Word damageDeleted=new Word();
            damageDeleted.setKey("damage.deleted");
            this.wordDao.save(damageDeleted);
            Word damageUpdated=new Word();
            damageUpdated.setKey("damage.updated");
            this.wordDao.save(damageUpdated);
            Word damageListed=new Word();
            damageListed.setKey("damage.listed");
            this.wordDao.save(damageListed);
            Word damageNotFound=new Word();
            damageNotFound.setKey("damage.not.found");
            this.wordDao.save(damageNotFound);
            Word damageGet=new Word();
            damageGet.setKey("damage.found");
            this.wordDao.save(damageGet);


            Word additionalServiceAdded=new Word();
            additionalServiceAdded.setKey("additional.service.added");
            this.wordDao.save(additionalServiceAdded);
            Word additionalServiceUpdated=new Word();
            additionalServiceUpdated.setKey("additional.service.updated");
            this.wordDao.save(additionalServiceUpdated);
            Word additionalServiceDeleted=new Word();
            additionalServiceDeleted.setKey("additional.service.deleted");
            this.wordDao.save(additionalServiceDeleted);
            Word additionalServiceListed=new Word();
            additionalServiceListed.setKey("additional.service.listed");
            this.wordDao.save(additionalServiceListed);
            Word additionalServiceNotFound=new Word();
            additionalServiceNotFound.setKey("additional.service.not.found");
            this.wordDao.save(additionalServiceNotFound);


            Word additionalRentalItemAdded=new Word();
            additionalRentalItemAdded.setKey("additional.rental.item.added");
            this.wordDao.save(additionalRentalItemAdded);
            Word additionalRentalItemDeleted=new Word();
            additionalRentalItemDeleted.setKey("additional.rental.item.deleted");
            this.wordDao.save(additionalRentalItemDeleted);
            Word additionalRentalItemUpdated=new Word();
            additionalRentalItemUpdated.setKey("additional.rental.item.updated");
            this.wordDao.save(additionalRentalItemUpdated);
            Word additionalRentalItemListed=new Word();
            additionalRentalItemListed.setKey("additional.rental.item.listed");
            this.wordDao.save(additionalRentalItemListed);
            Word additionalRentalItemNotFound=new Word();
            additionalRentalItemNotFound.setKey("additional.rental.item.not.found");
            this.wordDao.save(additionalRentalItemNotFound);


            Word carMaintenanceAdded=new Word();
            carMaintenanceAdded.setKey("car.maintenance.added");
            this.wordDao.save(carMaintenanceAdded);
            Word carMaintenanceUpdated=new Word();
            carMaintenanceUpdated.setKey("car.maintenance.updated");
            this.wordDao.save(carMaintenanceUpdated);
            Word carMaintenanceDeleted=new Word();
            carMaintenanceDeleted.setKey("car.maintenance.deleted");
            this.wordDao.save(carMaintenanceDeleted);
            Word carMaintenanceListed=new Word();
            carMaintenanceListed.setKey("car.maintenance.listed");
            this.wordDao.save(carMaintenanceListed);
            Word carMaintenanceRentalError=new Word();
            carMaintenanceRentalError.setKey("car.maintenance.rental.error");
            this.wordDao.save(carMaintenanceRentalError);
            Word carMaintenanceNotFound=new Word();
            carMaintenanceNotFound.setKey("car.maintenance.not.found");
            this.wordDao.save(carMaintenanceNotFound);

        }

    }

}

