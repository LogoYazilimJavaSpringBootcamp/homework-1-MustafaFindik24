# homework-1-MustafaFindik24
homework-1-MustafaFindik24 created by GitHub Classroom

- Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.
  
  Java yazdığımız kodu java compiler(javac) sayesinde bytecode a çevirir. Bytecode ise JVM(Java Virtual Machine) yardımıyla makine koduna çevirir.
Bu sayede çevirilen kod makinenin anlayabileceği bir düzeye indirgenir. İşletim sisteminden bağımsız bir halde CPU üzerinden işlemler gerçekleşir ve çıktı oluşur.
  Java platform bağımsız bir dildir ancak JVM farklı işletim sistemlerine göre entegre edilmek zorundadır. Bu yüzden birden fazla JVM sürümü oluşturulmuştur. 

- Java neden çoklu kalıtımı desteklemez? Hangi diller bu duruma neden izin verir?

  Java compiler(javac) hangi sınıfı kalıtacağını seçemez. Bu sebepten ötürü javada çoklu kalıtıma izin verilmez. C++, Python, R, Scala gibi diller çoklu kalıtıma izin verir.
  Daha esnek bir yazılım geliştirme imkanı sunar ancak Diamond problem denilen sorun bu konuda dikkat edilmesi gereken bir husustur. Çoklu kalıtımda birden fazla sınıftan türetilmiş 
  bir alt sınıf, bir metodu override etmek istediği zaman hangi metodu override edeceğini bilemez ve bu soruna diamond problem denir.
