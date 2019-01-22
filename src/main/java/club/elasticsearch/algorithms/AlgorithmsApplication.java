package club.elasticsearch.algorithms;

import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Today is 2019-01-22 , this is a adventure of my life.
 *
 * @author Ricky(道离)
 * @date 2019-01-22
 */
@Log4j2
public class AlgorithmsApplication {

    /**
     * Java enter method
     *
     * @param args command parameters
     */
    public static void main(String[] args) {
        log.info("This is a begin for learning algorithms.");
        LocalDate today = LocalDate.now();
        LocalDate deadLine = LocalDate.parse("2019-12-31");
        LocalDate flagDate = LocalDate.parse("2018-01-23");
        long days = DAYS.between(today, deadLine);
        log.info("Algorithms learning begin time is {}, today is {}, "
            + "remaining {} days. ", flagDate, today, days);
    }
}
