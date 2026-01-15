package com.quotevault.android.data.remote

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClientProvider {

    val client: SupabaseClient = createSupabaseClient(
        supabaseUrl = "https://mjeyecufvmlfwolkwnit.supabase.co",
        supabaseKey = "sb_publishable_XXXX"
    ) {
        install(Auth)
        install(Postgrest)
    }
}
