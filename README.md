# 📱 Linktree Android App

Aplikasi Android sederhana yang menampilkan daftar link seperti Linktree menggunakan RecyclerView.  
User dapat melihat dan membuka beberapa link sosial media atau website dalam satu halaman.

---

## 🎯 Tujuan Project

Project ini dibuat untuk:
- Melatih penggunaan RecyclerView di Android
- Mengimplementasikan Adapter & ViewHolder
- Mengelola list data dinamis
- Membuka URL menggunakan Intent
- Menerapkan UI sederhana dan rapi

---

## 🛠️ Teknologi yang Digunakan

- RecyclerView
- CardView
- Intent (ACTION_VIEW)

---

## 📌 Fitur Aplikasi

- Menampilkan daftar link menggunakan RecyclerView
- Setiap item berisi:
  - Logo platform
  - Username di platform tersebut
- Klik item akan membuka link di browser
- Desain sederhana dan clean

---

## 🧠 Konsep yang Dipelajari

### 1️⃣ RecyclerView
Digunakan untuk menampilkan daftar link secara efisien.

### 2️⃣ Adapter & ViewHolder
Menghubungkan data list dengan tampilan item layout.

### 3️⃣ Intent
Digunakan untuk membuka URL di browser.

---

## 📂 Struktur Project
```
│
├── MainActivity.kt
├── LinkAdapter.kt
├── LinkData.kt
└── res/layout/
├── activity_main.xml
└── adapter_avatar.xml
```

---

## 🧩 Struktur Data Model (ListData)

```kotlin
data class LinkModel(
    val title: String,
    val url: String
)
```

---

🔄 Cara Kerja RecyclerView

1. Data disimpan dalam List<LinkData>
2. Adapter menghubungkan data ke layout adapter_avatar
3. ViewHolder menampilkan data ke ImageView dan TextView
4. Klik item memanggil Intent untuk membuka browser

---

🧪 Contoh Inisialisasi Data

```kotlin
val linkList = listOf<LinkData>(
               Logo Medsos      Nama           URL
    LinkData("R.drawable.yt", "SeNau", "https://youtube.com"),
    LinkData("R.drawable.ig", "@SeNau", "https://instagram.com"),
    LinkData("R.drawable.wa", "SeNau", "https://wa.me/+000000000000.com"),
    LinkData("R.drawable.web", "SeNau", "https://github.com/")
)
```

---

▶️ Cara Menjalankan Project

1. Clone repository
2. Buka di Android Studio
3. Sync Gradle
4. Run di Emulator / Device

---

## 📸 Screenshot

![linktreeapp](https://github.com/user-attachments/assets/e70ab7b5-de63-4d81-9664-103f05e386af)


