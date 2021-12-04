### Dependências
- adicione no seu projeto as dependências abaixo:

puglins{
    id 'kotlin-android-extensions'
}

// recycler and cardview
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'androidx.recyclerview:recyclerview:1.2.1'

//biblioteca de carregamento de imagem
//glide
    def glide_version = '4.12.0'
    implementation "com.github.bumptech.glide:glide:$glide_version"
    annotationProcessor "com.github.bumptech.glide:compiler:$glide_version"

### Dados nos Items do RecyclerView
- criar um DataSource (dado local)
    ou
- consumir dados de uma API com retrofit  

### layout
- criar uma layout para representar os ITEMS do RecyclerView

### adapter
- O Adapter "adapta" a sua lista de dados para que eles sejam montados no RecyclerView

### RecyclerView
- criar o RecyclerView na MainActivity
- detectar clicks nos itens do RecyclerView (Boas práticas com Kotlin)