/*
 * Modul: Programmieren 3, AB01
 * Autor: Giuseppe Buccellato
 * Semester: SoSe2020
 */

package de.hsos.prog3.gbuccell.ab01.orchester;

import java.io.IOException;

public interface Verhalten {

    void spielen(Orchester orchester) throws IOException;
}
