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
            customerGet.setKey("customer.get");
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
            Word brandListed = new Word();
            brandListed.setKey("brand.listed");
            this.wordDao.save(brandListed);

            Word brandNameError = new Word();
            brandNameError.setKey("brand.name.error");
            this.wordDao.save(brandNameError);

            Word brandGet = new Word();
            brandGet.setKey("brand.get");
            this.wordDao.save(brandGet);

            Word brandNotFound = new Word();
            brandNotFound.setKey("brand.not.found");
            this.wordDao.save(brandGet);


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
            carGet.setKey("car.get");
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
            cityGet.setKey("city.get");
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
            colorGet.setKey("color.get");
            this.wordDao.save(colorGet);
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
            carImageGet.setKey("car.image.get");
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
            creditCardSave.setKey("credit.card.cvv.error");
            this.wordDao.save(creditCardSave);
            Word creditCardGet=new Word();
            creditCardGet.setKey("credit.card.get");
            this.wordDao.save(creditCardGet);
            Word creditCardNotSave=new Word();
            creditCardNotSave.setKey("credit.card.not.save");
            this.wordDao.save(creditCardNotSave);

            Word paymentAdd=new Word();
            paymentAdd.setKey("payment.add");
            this.wordDao.save(paymentAdd);
            Word paymentUpdated=new Word();
            paymentUpdated.setKey("payment.updated");
            this.wordDao.save(paymentUpdated);
            Word paymentDeleted=new Word();
            paymentDeleted.setKey("payment.updated");
            this.wordDao.save(paymentDeleted);
            Word paymentListed=new Word();
            paymentListed.setKey("payment.listed");
            this.wordDao.save(paymentListed);
            Word paymentCardSave=new Word();
            paymentCardSave.setKey("payment.card.save");
            this.wordDao.save(paymentCardSave);
            Word paymentCardNotSave=new Word();
            paymentCardNotSave.setKey("payment.card.save");
            this.wordDao.save(paymentCardNotSave);
            Word paymentCardFail=new Word();
            paymentCardFail.setKey("payment.card.fail");
            this.wordDao.save(paymentCardFail);

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
            invoiceGet.setKey("invoice.get");
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
            damageGet.setKey("damage.get");
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

        }

    }

}

