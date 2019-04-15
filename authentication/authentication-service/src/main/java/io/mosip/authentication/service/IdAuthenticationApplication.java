package io.mosip.authentication.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import io.mosip.authentication.service.config.IDAMappingConfig;
import io.mosip.kernel.cbeffutil.impl.CbeffImpl;
import io.mosip.kernel.crypto.jce.impl.DecryptorImpl;
import io.mosip.kernel.dataaccess.hibernate.config.HibernateDaoConfig;
import io.mosip.kernel.idgenerator.vid.impl.VidGeneratorImpl;
import io.mosip.kernel.idgenerator.vid.util.VidFilterUtils;
import io.mosip.kernel.idvalidator.uin.impl.UinValidatorImpl;
import io.mosip.kernel.idvalidator.vid.impl.VidValidatorImpl;
import io.mosip.kernel.pdfgenerator.itext.impl.PDFGeneratorImpl;
import io.mosip.kernel.pinvalidator.impl.PinValidatorImpl;

/**
 * Spring-boot class for ID Authentication Application.
 *
 * @author Dinesh Karuppiah
 */
@SpringBootApplication
@Import(value = { HibernateDaoConfig.class, UinValidatorImpl.class, VidValidatorImpl.class, IDAMappingConfig.class,
		PDFGeneratorImpl.class, DecryptorImpl.class, CbeffImpl.class, VidGeneratorImpl.class, VidFilterUtils.class,
		PinValidatorImpl.class })

public class IdAuthenticationApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(IdAuthenticationApplication.class, args);
	}

}
