# Codery

Codery, kullanıcıların HTML, CSS, JS veya diğer formatlarda kod parçacıkları ekleyip görüntüleyebildiği Android tabanlı bir kod depo (code store) uygulamasıdır. Uygulama tamamen Java ile geliştirilmiştir ve klasik Android UI bileşenleri üzerine kuruludur.

---

## 🚀 Özellikler

- Kod kaydetme, listeleme ve görüntüleme sistemi  
- JSON tabanlı veri yapısı  
- Çok ekranlı mimari (KodstoreActivity, MenuActivity vb.)  
- Özelleştirilmiş `ListView` ve `GridView` adaptörleri  
- Hafif, hızlı ve genişletilebilir yapı  

---

## 📂 Proje Yapısı

```plaintext
/
├─ app/
│  ├─ java/
│  │  ├─ codery/tr/
│  │  │  ├─ KodstoreActivity.java
│  │  │  ├─ MenuActivity.java
│  │  │  ├─ Gridview1Adapter.java
│  │  │  ├─ Listview1Adapter.java
│  │  │  └─ Diğer yardımcı Java sınıfları
│  ├─ res/
│  │  ├─ layout/        # XML ekran tasarımları
│  │  ├─ drawable/      # Arayüz görselleri
│  │  └─ values/        # strings, styles vb.
│  └─ AndroidManifest.xml
├─ build.gradle
├─ gradle.properties
└─ settings.gradle
## 🧩 Teknik Detaylar

### **Dil ve Teknolojiler**
- Java (Android)
- XML tabanlı UI
- JSON veri formatı
- Özel adapter yapıları
- ListView & GridView render sistemleri

### **Veri İşleme**
KodstoreActivity içinde JSON verileri alınır, parse edilir ve listeye aktarılır.  
Her öğe aşağıdaki formatı kullanır:

```json
{ "title": "...", "code": "..." }

## 🎯 Ekran Mantığı

### **MenuActivity**
- GridView içerir  
- Kod kategorilerini veya giriş noktalarını listeler  

### **KodstoreActivity**
- JSON’dan gelen kodları ListView içinde listeler  
- Seçilen kodun detayını veya içeriğini gösterir

## 🛠 Geliştirilebilir Alanlar

- Kodlara syntax highlighting eklenmesi  
- Firebase veya başka bir backend ile online kod depolama  
- Kullanıcı giriş sistemi  
- Arama + filtreleme özellikleri  
- Modern UI (Material 3) güncellemesi  
- Dark mode desteği
