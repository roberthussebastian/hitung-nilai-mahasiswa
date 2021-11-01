package org.example.nilaimahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.example.nilaimahasiswa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener {
            hitungNilai()
        }
    }

    //function on button for calculate and show all input from user
    private fun hitungNilai() {
        val nim = binding.editNim.text.toString().toInt()
        val nama = binding.editNama.text
        val kehadiran = binding.editKehadiran.text.toString().toDouble()
        val tugas = binding.editTugas.text.toString().toDouble()
        val uts = binding.editUts.text.toString().toDouble()
        val uas = binding.editUas.text.toString().toDouble()

        val nilaiAkhir = (0.10 * kehadiran) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas)
        val mutu =
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                "A"
            } else if (nilaiAkhir >= 70 && nilaiAkhir <= 79) {
                "B"
            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 69) {
                "C"
            } else if (nilaiAkhir >= 40 && nilaiAkhir <= 59) {
                "D"
            } else {
                "E"
            }

        binding.idViewNim.text = getString(R.string.hasilNim, nim)
        binding.idViewNama.text = getString(R.string.hasilNama, nama)
        binding.idViewKehadiran.text = getString(R.string.hasilKehadiran, kehadiran)
        binding.idViewTugas.text = getString(R.string.hasilTugas, tugas)
        binding.idViewUts.text = getString(R.string.hasilUts, uts)
        binding.idViewUas.text = getString(R.string.hasilUas, uas)
        binding.idViewNilaiAkhir.text = getString(R.string.hasilAkhir, nilaiAkhir)
        binding.idViewMutu.text = getString(R.string.mutu, mutu)

    }
}